package com.entity.vo;

import com.entity.DangyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 党员信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
public class DangyuanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 党员姓名
	 */
	
	private String dangyuanxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 入党日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date rudangriqi;
		
	/**
	 * 党龄
	 */
	
	private String dangling;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：党员姓名
	 */
	 
	public void setDangyuanxingming(String dangyuanxingming) {
		this.dangyuanxingming = dangyuanxingming;
	}
	
	/**
	 * 获取：党员姓名
	 */
	public String getDangyuanxingming() {
		return dangyuanxingming;
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
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
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
	 * 设置：入党日期
	 */
	 
	public void setRudangriqi(Date rudangriqi) {
		this.rudangriqi = rudangriqi;
	}
	
	/**
	 * 获取：入党日期
	 */
	public Date getRudangriqi() {
		return rudangriqi;
	}
				
	
	/**
	 * 设置：党龄
	 */
	 
	public void setDangling(String dangling) {
		this.dangling = dangling;
	}
	
	/**
	 * 获取：党龄
	 */
	public String getDangling() {
		return dangling;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
