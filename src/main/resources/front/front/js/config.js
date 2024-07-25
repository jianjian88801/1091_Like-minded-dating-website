
var projectName = '志同道合交友网站';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '会员信息',
	url: './pages/huiyuanxinxi/list.html'
}, 
{
	name: '文章信息',
	url: './pages/wenzhangxinxi/list.html'
}, 

{
	name: '交友论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '网站公告',
	url: './pages/news/list.html'
},
{
	name: '留言板',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/springboot2x7r5/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除"],"menu":"会员","menuJump":"列表","tableName":"huiyuan"}],"menu":"会员管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除","查看评论"],"menu":"会员信息","menuJump":"列表","tableName":"huiyuanxinxi"}],"menu":"会员信息管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["新增","查看","修改","删除"],"menu":"文章分类","menuJump":"列表","tableName":"wenzhangfenlei"}],"menu":"文章分类管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除","查看评论"],"menu":"文章信息","menuJump":"列表","tableName":"wenzhangxinxi"}],"menu":"文章信息管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"appFrontIcon":"cuIcon-group","buttons":["查看","修改","删除"],"menu":"交友论坛","tableName":"forum"}],"menu":"交友论坛"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"网站公告","tableName":"news"},{"appFrontIcon":"cuIcon-news","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看"],"menu":"会员信息列表","menuJump":"列表","tableName":"huiyuanxinxi"}],"menu":"会员信息模块"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看"],"menu":"文章信息列表","menuJump":"列表","tableName":"wenzhangxinxi"}],"menu":"文章信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除","查看评论"],"menu":"会员信息","menuJump":"列表","tableName":"huiyuanxinxi"}],"menu":"会员信息管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除","查看评论"],"menu":"文章信息","menuJump":"列表","tableName":"wenzhangxinxi"}],"menu":"文章信息管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看"],"menu":"会员信息列表","menuJump":"列表","tableName":"huiyuanxinxi"}],"menu":"会员信息模块"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看"],"menu":"文章信息列表","menuJump":"列表","tableName":"wenzhangxinxi"}],"menu":"文章信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"会员","tableName":"huiyuan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
