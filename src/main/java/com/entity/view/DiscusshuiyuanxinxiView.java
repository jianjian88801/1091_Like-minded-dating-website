package com.entity.view;

import com.entity.DiscusshuiyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-05 14:13:03
 */
@TableName("discusshuiyuanxinxi")
public class DiscusshuiyuanxinxiView  extends DiscusshuiyuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusshuiyuanxinxiView(){
	}
 
 	public DiscusshuiyuanxinxiView(DiscusshuiyuanxinxiEntity discusshuiyuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusshuiyuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
