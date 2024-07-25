package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshuiyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshuiyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshuiyuanxinxiView;


/**
 * 会员信息评论表
 *
 * @author 
 * @email 
 * @date 2022-04-05 14:13:03
 */
public interface DiscusshuiyuanxinxiService extends IService<DiscusshuiyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshuiyuanxinxiVO> selectListVO(Wrapper<DiscusshuiyuanxinxiEntity> wrapper);
   	
   	DiscusshuiyuanxinxiVO selectVO(@Param("ew") Wrapper<DiscusshuiyuanxinxiEntity> wrapper);
   	
   	List<DiscusshuiyuanxinxiView> selectListView(Wrapper<DiscusshuiyuanxinxiEntity> wrapper);
   	
   	DiscusshuiyuanxinxiView selectView(@Param("ew") Wrapper<DiscusshuiyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshuiyuanxinxiEntity> wrapper);
   	

}

