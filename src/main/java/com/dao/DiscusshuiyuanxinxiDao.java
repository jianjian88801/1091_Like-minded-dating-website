package com.dao;

import com.entity.DiscusshuiyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshuiyuanxinxiVO;
import com.entity.view.DiscusshuiyuanxinxiView;


/**
 * 会员信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-05 14:13:03
 */
public interface DiscusshuiyuanxinxiDao extends BaseMapper<DiscusshuiyuanxinxiEntity> {
	
	List<DiscusshuiyuanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusshuiyuanxinxiEntity> wrapper);
	
	DiscusshuiyuanxinxiVO selectVO(@Param("ew") Wrapper<DiscusshuiyuanxinxiEntity> wrapper);
	
	List<DiscusshuiyuanxinxiView> selectListView(@Param("ew") Wrapper<DiscusshuiyuanxinxiEntity> wrapper);

	List<DiscusshuiyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshuiyuanxinxiEntity> wrapper);
	
	DiscusshuiyuanxinxiView selectView(@Param("ew") Wrapper<DiscusshuiyuanxinxiEntity> wrapper);
	

}
