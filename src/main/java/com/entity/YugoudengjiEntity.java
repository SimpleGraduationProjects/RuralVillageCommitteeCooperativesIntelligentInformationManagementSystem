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
 * 预购登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
@TableName("yugoudengji")
public class YugoudengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YugoudengjiEntity() {
		
	}
	
	public YugoudengjiEntity(T t) {
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
	 * 登记编号
	 */
					
	private String dengjibianhao;
	
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
	 * 预购数量
	 */
					
	private Integer yugoushuliang;
	
	/**
	 * 预购价格
	 */
					
	private Integer yugoujiage;
	
	/**
	 * 总金额
	 */
					
	private String zongjine;
	
	/**
	 * 预订时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yudingshijian;
	
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
	 * 设置：登记编号
	 */
	public void setDengjibianhao(String dengjibianhao) {
		this.dengjibianhao = dengjibianhao;
	}
	/**
	 * 获取：登记编号
	 */
	public String getDengjibianhao() {
		return dengjibianhao;
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
	 * 设置：预购数量
	 */
	public void setYugoushuliang(Integer yugoushuliang) {
		this.yugoushuliang = yugoushuliang;
	}
	/**
	 * 获取：预购数量
	 */
	public Integer getYugoushuliang() {
		return yugoushuliang;
	}
	/**
	 * 设置：预购价格
	 */
	public void setYugoujiage(Integer yugoujiage) {
		this.yugoujiage = yugoujiage;
	}
	/**
	 * 获取：预购价格
	 */
	public Integer getYugoujiage() {
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
	 * 设置：预订时间
	 */
	public void setYudingshijian(Date yudingshijian) {
		this.yudingshijian = yudingshijian;
	}
	/**
	 * 获取：预订时间
	 */
	public Date getYudingshijian() {
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
