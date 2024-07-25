package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenzhangfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenzhangfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenzhangfenleiView;


/**
 * 文章分类
 *
 * @author 
 * @email 
 * @date 2022-04-05 14:13:03
 */
public interface WenzhangfenleiService extends IService<WenzhangfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenzhangfenleiVO> selectListVO(Wrapper<WenzhangfenleiEntity> wrapper);
   	
   	WenzhangfenleiVO selectVO(@Param("ew") Wrapper<WenzhangfenleiEntity> wrapper);
   	
   	List<WenzhangfenleiView> selectListView(Wrapper<WenzhangfenleiEntity> wrapper);
   	
   	WenzhangfenleiView selectView(@Param("ew") Wrapper<WenzhangfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenzhangfenleiEntity> wrapper);
   	

}

