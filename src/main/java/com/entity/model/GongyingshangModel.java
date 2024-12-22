package com.entity.model;

import com.entity.GongyingshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 供应商
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public class GongyingshangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 手机号
	 */
	
	private String shoujihao;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 公司地址
	 */
	
	private String gongsidizhi;
		
	/**
	 * 主要产品
	 */
	
	private String zhuyaochanpin;
				
	
	/**
	 * 设置：联系人
	 */
	 
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
				
	
	/**
	 * 设置：手机号
	 */
	 
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
				
	
	/**
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
				
	
	/**
	 * 设置：公司地址
	 */
	 
	public void setGongsidizhi(String gongsidizhi) {
		this.gongsidizhi = gongsidizhi;
	}
	
	/**
	 * 获取：公司地址
	 */
	public String getGongsidizhi() {
		return gongsidizhi;
	}
				
	
	/**
	 * 设置：主要产品
	 */
	 
	public void setZhuyaochanpin(String zhuyaochanpin) {
		this.zhuyaochanpin = zhuyaochanpin;
	}
	
	/**
	 * 获取：主要产品
	 */
	public String getZhuyaochanpin() {
		return zhuyaochanpin;
	}
			
}
