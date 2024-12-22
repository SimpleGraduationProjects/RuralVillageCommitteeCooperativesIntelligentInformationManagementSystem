package com.entity.model;

import com.entity.ShouruxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 收入信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public class ShouruxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 收入项目
	 */
	
	private String shouruxiangmu;
		
	/**
	 * 金额
	 */
	
	private Integer jine;
		
	/**
	 * 结算方式
	 */
	
	private String jiesuanfangshi;
		
	/**
	 * 账户
	 */
	
	private String zhanghu;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：收入项目
	 */
	 
	public void setShouruxiangmu(String shouruxiangmu) {
		this.shouruxiangmu = shouruxiangmu;
	}
	
	/**
	 * 获取：收入项目
	 */
	public String getShouruxiangmu() {
		return shouruxiangmu;
	}
				
	
	/**
	 * 设置：金额
	 */
	 
	public void setJine(Integer jine) {
		this.jine = jine;
	}
	
	/**
	 * 获取：金额
	 */
	public Integer getJine() {
		return jine;
	}
				
	
	/**
	 * 设置：结算方式
	 */
	 
	public void setJiesuanfangshi(String jiesuanfangshi) {
		this.jiesuanfangshi = jiesuanfangshi;
	}
	
	/**
	 * 获取：结算方式
	 */
	public String getJiesuanfangshi() {
		return jiesuanfangshi;
	}
				
	
	/**
	 * 设置：账户
	 */
	 
	public void setZhanghu(String zhanghu) {
		this.zhanghu = zhanghu;
	}
	
	/**
	 * 获取：账户
	 */
	public String getZhanghu() {
		return zhanghu;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
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
