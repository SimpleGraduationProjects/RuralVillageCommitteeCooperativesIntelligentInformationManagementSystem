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
 * 供应商
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
@TableName("gongyingshang")
public class GongyingshangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongyingshangEntity() {
		
	}
	
	public GongyingshangEntity(T t) {
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
	 * 供应商名称
	 */
					
	private String gongyingshangmingcheng;
	
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
