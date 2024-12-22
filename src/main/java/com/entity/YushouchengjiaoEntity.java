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
 * 预售成交
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
@TableName("yushouchengjiao")
public class YushouchengjiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YushouchengjiaoEntity() {
		
	}
	
	public YushouchengjiaoEntity(T t) {
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
	 * 预售编号
	 */
					
	private String yushoubianhao;
	
	/**
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
	/**
	 * 商品分类
	 */
					
	private String shangpinfenlei;
	
	/**
	 * 预售数量
	 */
					
	private String yushoushuliang;
	
	/**
	 * 预售价格
	 */
					
	private String yushoujiage;
	
	/**
	 * 预售金额
	 */
					
	private String yushoujine;
	
	/**
	 * 预售时间
	 */
					
	private String yushoushijian;
	
	/**
	 * 村民账号
	 */
					
	private String cunminzhanghao;
	
	/**
	 * 村民姓名
	 */
					
	private String cunminxingming;
	
	/**
	 * 成交时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chengjiaoshijian;
	
	
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
	 * 设置：预售编号
	 */
	public void setYushoubianhao(String yushoubianhao) {
		this.yushoubianhao = yushoubianhao;
	}
	/**
	 * 获取：预售编号
	 */
	public String getYushoubianhao() {
		return yushoubianhao;
	}
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
	 * 设置：预售数量
	 */
	public void setYushoushuliang(String yushoushuliang) {
		this.yushoushuliang = yushoushuliang;
	}
	/**
	 * 获取：预售数量
	 */
	public String getYushoushuliang() {
		return yushoushuliang;
	}
	/**
	 * 设置：预售价格
	 */
	public void setYushoujiage(String yushoujiage) {
		this.yushoujiage = yushoujiage;
	}
	/**
	 * 获取：预售价格
	 */
	public String getYushoujiage() {
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
	public void setYushoushijian(String yushoushijian) {
		this.yushoushijian = yushoushijian;
	}
	/**
	 * 获取：预售时间
	 */
	public String getYushoushijian() {
		return yushoushijian;
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

}