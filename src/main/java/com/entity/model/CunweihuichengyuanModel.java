package com.entity.model;

import com.entity.CunweihuichengyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 村委会成员
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
public class CunweihuichengyuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private Integer nianling;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 居住地址
	 */
	
	private String juzhudizhi;
		
	/**
	 * 成员手机
	 */
	
	private String chengyuanshouji;
		
	/**
	 * 职务
	 */
	
	private String zhiwu;
		
	/**
	 * 学历
	 */
	
	private String xueli;
				
	
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
	 * 设置：年龄
	 */
	 
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：居住地址
	 */
	 
	public void setJuzhudizhi(String juzhudizhi) {
		this.juzhudizhi = juzhudizhi;
	}
	
	/**
	 * 获取：居住地址
	 */
	public String getJuzhudizhi() {
		return juzhudizhi;
	}
				
	
	/**
	 * 设置：成员手机
	 */
	 
	public void setChengyuanshouji(String chengyuanshouji) {
		this.chengyuanshouji = chengyuanshouji;
	}
	
	/**
	 * 获取：成员手机
	 */
	public String getChengyuanshouji() {
		return chengyuanshouji;
	}
				
	
	/**
	 * 设置：职务
	 */
	 
	public void setZhiwu(String zhiwu) {
		this.zhiwu = zhiwu;
	}
	
	/**
	 * 获取：职务
	 */
	public String getZhiwu() {
		return zhiwu;
	}
				
	
	/**
	 * 设置：学历
	 */
	 
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	
	/**
	 * 获取：学历
	 */
	public String getXueli() {
		return xueli;
	}
			
}
