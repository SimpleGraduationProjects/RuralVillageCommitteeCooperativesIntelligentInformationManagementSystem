package com.entity.vo;

import com.entity.HezuoshechengyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 合作社成员
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public class HezuoshechengyuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 成员姓名
	 */
	
	private String chengyuanxingming;
		
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
	 * 设置：成员姓名
	 */
	 
	public void setChengyuanxingming(String chengyuanxingming) {
		this.chengyuanxingming = chengyuanxingming;
	}
	
	/**
	 * 获取：成员姓名
	 */
	public String getChengyuanxingming() {
		return chengyuanxingming;
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
			
}
