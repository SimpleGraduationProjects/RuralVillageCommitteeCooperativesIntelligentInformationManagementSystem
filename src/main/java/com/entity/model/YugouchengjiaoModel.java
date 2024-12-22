package com.entity.model;

import com.entity.YugouchengjiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 预购成交
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public class YugouchengjiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品名称
	 */
	
	private String shangpinmingcheng;
		
	/**
	 * 商品分类
	 */
	
	private String shangpinfenlei;
		
	/**
	 * 预购数量
	 */
	
	private String yugoushuliang;
		
	/**
	 * 预购价格
	 */
	
	private String yugoujiage;
		
	/**
	 * 总金额
	 */
	
	private String zongjine;
		
	/**
	 * 成交时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chengjiaoshijian;
		
	/**
	 * 预订时间
	 */
	
	private String yudingshijian;
		
	/**
	 * 村民账号
	 */
	
	private String cunminzhanghao;
		
	/**
	 * 村民姓名
	 */
	
	private String cunminxingming;
				
	
	/**
	 * 设置：商品名称
	 */
	 
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
				
	
	/**
	 * 设置：商品分类
	 */
	 
	public void setShangpinfenlei(String shangpinfenlei) {
		this.shangpinfenlei = shangpinfenlei;
	}
	
	/**
	 * 获取：商品分类
	 */
	public String getShangpinfenlei() {
		return shangpinfenlei;
	}
				
	
	/**
	 * 设置：预购数量
	 */
	 
	public void setYugoushuliang(String yugoushuliang) {
		this.yugoushuliang = yugoushuliang;
	}
	
	/**
	 * 获取：预购数量
	 */
	public String getYugoushuliang() {
		return yugoushuliang;
	}
				
	
	/**
	 * 设置：预购价格
	 */
	 
	public void setYugoujiage(String yugoujiage) {
		this.yugoujiage = yugoujiage;
	}
	
	/**
	 * 获取：预购价格
	 */
	public String getYugoujiage() {
		return yugoujiage;
	}
				
	
	/**
	 * 设置：总金额
	 */
	 
	public void setZongjine(String zongjine) {
		this.zongjine = zongjine;
	}
	
	/**
	 * 获取：总金额
	 */
	public String getZongjine() {
		return zongjine;
	}
				
	
	/**
	 * 设置：成交时间
	 */
	 
	public void setChengjiaoshijian(Date chengjiaoshijian) {
		this.chengjiaoshijian = chengjiaoshijian;
	}
	
	/**
	 * 获取：成交时间
	 */
	public Date getChengjiaoshijian() {
		return chengjiaoshijian;
	}
				
	
	/**
	 * 设置：预订时间
	 */
	 
	public void setYudingshijian(String yudingshijian) {
		this.yudingshijian = yudingshijian;
	}
	
	/**
	 * 获取：预订时间
	 */
	public String getYudingshijian() {
		return yudingshijian;
	}
				
	
	/**
	 * 设置：村民账号
	 */
	 
	public void setCunminzhanghao(String cunminzhanghao) {
		this.cunminzhanghao = cunminzhanghao;
	}
	
	/**
	 * 获取：村民账号
	 */
	public String getCunminzhanghao() {
		return cunminzhanghao;
	}
				
	
	/**
	 * 设置：村民姓名
	 */
	 
	public void setCunminxingming(String cunminxingming) {
		this.cunminxingming = cunminxingming;
	}
	
	/**
	 * 获取：村民姓名
	 */
	public String getCunminxingming() {
		return cunminxingming;
	}
			
}
