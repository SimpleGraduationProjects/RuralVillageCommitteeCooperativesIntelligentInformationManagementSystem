package com.entity.vo;

import com.entity.HugengzuodengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 户耕作登记
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
public class HugengzuodengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 村民账号
	 */
	
	private String cunminzhanghao;
		
	/**
	 * 村民姓名
	 */
	
	private String cunminxingming;
		
	/**
	 * 居住地址
	 */
	
	private String juzhudizhi;
		
	/**
	 * 地块名称
	 */
	
	private String dikuaimingcheng;
		
	/**
	 * 地块面积
	 */
	
	private String dikuaimianji;
		
	/**
	 * 主要农业
	 */
	
	private String zhuyaonongye;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：地块名称
	 */
	 
	public void setDikuaimingcheng(String dikuaimingcheng) {
		this.dikuaimingcheng = dikuaimingcheng;
	}
	
	/**
	 * 获取：地块名称
	 */
	public String getDikuaimingcheng() {
		return dikuaimingcheng;
	}
				
	
	/**
	 * 设置：地块面积
	 */
	 
	public void setDikuaimianji(String dikuaimianji) {
		this.dikuaimianji = dikuaimianji;
	}
	
	/**
	 * 获取：地块面积
	 */
	public String getDikuaimianji() {
		return dikuaimianji;
	}
				
	
	/**
	 * 设置：主要农业
	 */
	 
	public void setZhuyaonongye(String zhuyaonongye) {
		this.zhuyaonongye = zhuyaonongye;
	}
	
	/**
	 * 获取：主要农业
	 */
	public String getZhuyaonongye() {
		return zhuyaonongye;
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
