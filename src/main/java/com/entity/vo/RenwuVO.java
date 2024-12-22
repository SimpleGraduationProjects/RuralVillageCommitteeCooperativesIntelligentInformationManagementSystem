package com.entity.vo;

import com.entity.RenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 任务
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
public class RenwuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 任务内容
	 */
	
	private String renwuneirong;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 要求时间
	 */
	
	private String yaoqiushijian;
				
	
	/**
	 * 设置：任务内容
	 */
	 
	public void setRenwuneirong(String renwuneirong) {
		this.renwuneirong = renwuneirong;
	}
	
	/**
	 * 获取：任务内容
	 */
	public String getRenwuneirong() {
		return renwuneirong;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：要求时间
	 */
	 
	public void setYaoqiushijian(String yaoqiushijian) {
		this.yaoqiushijian = yaoqiushijian;
	}
	
	/**
	 * 获取：要求时间
	 */
	public String getYaoqiushijian() {
		return yaoqiushijian;
	}
			
}
