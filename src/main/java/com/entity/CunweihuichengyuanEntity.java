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
 * 村委会成员
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
@TableName("cunweihuichengyuan")
public class CunweihuichengyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CunweihuichengyuanEntity() {
		
	}
	
	public CunweihuichengyuanEntity(T t) {
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
	 * 成员姓名
	 */
					
	private String chengyuanxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 年龄
	 */
					
	private Integer nianling;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 居住地址
	 */
					
	private String juzhudizhi;
	
	/**
	 * 成员手机
	 */
					
	private String chengyuanshouji;
	
	/**
	 * 职务
	 */
					
	private String zhiwu;
	
	/**
	 * 学历
	 */
					
	private String xueli;
	
	
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
	 * 设置：成员姓名
	 */
	public void setChengyuanxingming(String chengyuanxingming) {
		this.chengyuanxingming = chengyuanxingming;
	}
	/**
	 * 获取：成员姓名
	 */
	public String getChengyuanxingming() {
		return chengyuanxingming;
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
	 * 设置：年龄
	 */
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
	 * 设置：成员手机
	 */
	public void setChengyuanshouji(String chengyuanshouji) {
		this.chengyuanshouji = chengyuanshouji;
	}
	/**
	 * 获取：成员手机
	 */
	public String getChengyuanshouji() {
		return chengyuanshouji;
	}
	/**
	 * 设置：职务
	 */
	public void setZhiwu(String zhiwu) {
		this.zhiwu = zhiwu;
	}
	/**
	 * 获取：职务
	 */
	public String getZhiwu() {
		return zhiwu;
	}
	/**
	 * 设置：学历
	 */
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	/**
	 * 获取：学历
	 */
	public String getXueli() {
		return xueli;
	}

}
