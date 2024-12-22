package com.entity.vo;

import com.entity.QijiancaigoutongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 期间采购统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public class QijiancaigoutongjiVO  implements Serializable {
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
	 * 采购数量
	 */
	
	private Integer caigoushuliang;
		
	/**
	 * 供应商
	 */
	
	private String gongyingshang;
		
	/**
	 * 采购时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date caigoushijian;
		
	/**
	 * 支出费用
	 */
	
	private Integer zhichufeiyong;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：采购数量
	 */
	 
	public void setCaigoushuliang(Integer caigoushuliang) {
		this.caigoushuliang = caigoushuliang;
	}
	
	/**
	 * 获取：采购数量
	 */
	public Integer getCaigoushuliang() {
		return caigoushuliang;
	}
				
	
	/**
	 * 设置：供应商
	 */
	 
	public void setGongyingshang(String gongyingshang) {
		this.gongyingshang = gongyingshang;
	}
	
	/**
	 * 获取：供应商
	 */
	public String getGongyingshang() {
		return gongyingshang;
	}
				
	
	/**
	 * 设置：采购时间
	 */
	 
	public void setCaigoushijian(Date caigoushijian) {
		this.caigoushijian = caigoushijian;
	}
	
	/**
	 * 获取：采购时间
	 */
	public Date getCaigoushijian() {
		return caigoushijian;
	}
				
	
	/**
	 * 设置：支出费用
	 */
	 
	public void setZhichufeiyong(Integer zhichufeiyong) {
		this.zhichufeiyong = zhichufeiyong;
	}
	
	/**
	 * 获取：支出费用
	 */
	public Integer getZhichufeiyong() {
		return zhichufeiyong;
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
