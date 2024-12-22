package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 党员变动
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
@TableName("dangyuanbiandong")
public class DangyuanbiandongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DangyuanbiandongEntity() {
		
	}
	
	public DangyuanbiandongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 党号
	 */
					
	private String danghao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date biandongshijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：党号
	 */
	public void setDanghao(String danghao) {
		this.danghao = danghao;
	}
	/**
	 * 获取：党号
	 */
	public String getDanghao() {
		return danghao;
	}
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
