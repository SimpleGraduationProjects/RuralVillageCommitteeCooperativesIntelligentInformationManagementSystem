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
 * 支出信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
@TableName("zhichuxinxi")
public class ZhichuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhichuxinxiEntity() {
		
	}
	
	public ZhichuxinxiEntity(T t) {
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
	 * 支出单号
	 */
					
	private String zhichudanhao;
	
	/**
	 * 支出项目
	 */
					
	private String zhichuxiangmu;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
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
	 * 设置：支出单号
	 */
	public void setZhichudanhao(String zhichudanhao) {
		this.zhichudanhao = zhichudanhao;
	}
	/**
	 * 获取：支出单号
	 */
	public String getZhichudanhao() {
		return zhichudanhao;
	}
	/**
	 * 设置：支出项目
	 */
	public void setZhichuxiangmu(String zhichuxiangmu) {
		this.zhichuxiangmu = zhichuxiangmu;
	}
	/**
	 * 获取：支出项目
	 */
	public String getZhichuxiangmu() {
		return zhichuxiangmu;
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
