package com.entity.model;

import com.entity.YushoudengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 预售登记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public class YushoudengjiModel  implements Serializable {
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
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 供应商名称
	 */
	
	private String gongyingshangmingcheng;
		
	/**
	 * 预售数量
	 */
	
	private Integer yushoushuliang;
		
	/**
	 * 预售价格
	 */
	
	private Integer yushoujiage;
		
	/**
	 * 预售金额
	 */
	
	private String yushoujine;
		
	/**
	 * 预售时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yushoushijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 村民账号
	 */
	
	private String cunminzhanghao;
		
	/**
	 * 村民姓名
	 */
	
	private String cunminxingming;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
				
	
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
	 * 设置：品牌
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
				
	
	/**
	 * 设置：供应商名称
	 */
	 
	public void setGongyingshangmingcheng(String gongyingshangmingcheng) {
		this.gongyingshangmingcheng = gongyingshangmingcheng;
	}
	
	/**
	 * 获取：供应商名称
	 */
	public String getGongyingshangmingcheng() {
		return gongyingshangmingcheng;
	}
				
	
	/**
	 * 设置：预售数量
	 */
	 
	public void setYushoushuliang(Integer yushoushuliang) {
		this.yushoushuliang = yushoushuliang;
	}
	
	/**
	 * 获取：预售数量
	 */
	public Integer getYushoushuliang() {
		return yushoushuliang;
	}
				
	
	/**
	 * 设置：预售价格
	 */
	 
	public void setYushoujiage(Integer yushoujiage) {
		this.yushoujiage = yushoujiage;
	}
	
	/**
	 * 获取：预售价格
	 */
	public Integer getYushoujiage() {
		return yushoujiage;
	}
				
	
	/**
	 * 设置：预售金额
	 */
	 
	public void setYushoujine(String yushoujine) {
		this.yushoujine = yushoujine;
	}
	
	/**
	 * 获取：预售金额
	 */
	public String getYushoujine() {
		return yushoujine;
	}
				
	
	/**
	 * 设置：预售时间
	 */
	 
	public void setYushoushijian(Date yushoushijian) {
		this.yushoushijian = yushoushijian;
	}
	
	/**
	 * 获取：预售时间
	 */
	public Date getYushoushijian() {
		return yushoushijian;
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
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
			
}
