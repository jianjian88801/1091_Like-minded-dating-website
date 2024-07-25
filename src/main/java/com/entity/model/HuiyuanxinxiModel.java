package com.entity.model;

import com.entity.HuiyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 会员信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-05 14:13:03
 */
public class HuiyuanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 工作
	 */
	
	private String gongzuo;
		
	/**
	 * 爱好
	 */
	
	private String aihao;
		
	/**
	 * 个人特长
	 */
	
	private String gerentezhang;
		
	/**
	 * 自我介绍
	 */
	
	private String ziwojieshao;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：工作
	 */
	 
	public void setGongzuo(String gongzuo) {
		this.gongzuo = gongzuo;
	}
	
	/**
	 * 获取：工作
	 */
	public String getGongzuo() {
		return gongzuo;
	}
				
	
	/**
	 * 设置：爱好
	 */
	 
	public void setAihao(String aihao) {
		this.aihao = aihao;
	}
	
	/**
	 * 获取：爱好
	 */
	public String getAihao() {
		return aihao;
	}
				
	
	/**
	 * 设置：个人特长
	 */
	 
	public void setGerentezhang(String gerentezhang) {
		this.gerentezhang = gerentezhang;
	}
	
	/**
	 * 获取：个人特长
	 */
	public String getGerentezhang() {
		return gerentezhang;
	}
				
	
	/**
	 * 设置：自我介绍
	 */
	 
	public void setZiwojieshao(String ziwojieshao) {
		this.ziwojieshao = ziwojieshao;
	}
	
	/**
	 * 获取：自我介绍
	 */
	public String getZiwojieshao() {
		return ziwojieshao;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
