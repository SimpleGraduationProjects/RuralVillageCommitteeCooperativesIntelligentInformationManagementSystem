package com.entity.model;

import com.entity.DangyuanbiandongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 党员变动
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public class DangyuanbiandongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 党员姓名
	 */
	
	private String dangyuanxingming;
		
	/**
	 * 原先职务
	 */
	
	private String yuanxianzhiwu;
		
	/**
	 * 原先岗位
	 */
	
	private String yuanxiangangwei;
		
	/**
	 * 变动职务
	 */
	
	private String biandongzhiwu;
		
	/**
	 * 变动岗位
	 */
	
	private String biandonggangwei;
		
	/**
	 * 变动时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date biandongshijian;
		
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
	 * 设置：原先职务
	 */
	 
	public void setYuanxianzhiwu(String yuanxianzhiwu) {
		this.yuanxianzhiwu = yuanxianzhiwu;
	}
	
	/**
	 * 获取：原先职务
	 */
	public String getYuanxianzhiwu() {
		return yuanxianzhiwu;
	}
				
	
	/**
	 * 设置：原先岗位
	 */
	 
	public void setYuanxiangangwei(String yuanxiangangwei) {
		this.yuanxiangangwei = yuanxiangangwei;
	}
	
	/**
	 * 获取：原先岗位
	 */
	public String getYuanxiangangwei() {
		return yuanxiangangwei;
	}
				
	
	/**
	 * 设置：变动职务
	 */
	 
	public void setBiandongzhiwu(String biandongzhiwu) {
		this.biandongzhiwu = biandongzhiwu;
	}
	
	/**
	 * 获取：变动职务
	 */
	public String getBiandongzhiwu() {
		return biandongzhiwu;
	}
				
	
	/**
	 * 设置：变动岗位
	 */
	 
	public void setBiandonggangwei(String biandonggangwei) {
		this.biandonggangwei = biandonggangwei;
	}
	
	/**
	 * 获取：变动岗位
	 */
	public String getBiandonggangwei() {
		return biandonggangwei;
	}
				
	
	/**
	 * 设置：变动时间
	 */
	 
	public void setBiandongshijian(Date biandongshijian) {
		this.biandongshijian = biandongshijian;
	}
	
	/**
	 * 获取：变动时间
	 */
	public Date getBiandongshijian() {
		return biandongshijian;
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
