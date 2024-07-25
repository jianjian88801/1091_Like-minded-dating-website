const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot2x7r5/",
            name: "springboot2x7r5",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot2x7r5/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "志同道合交友网站"
        } 
    }
}
export default base
