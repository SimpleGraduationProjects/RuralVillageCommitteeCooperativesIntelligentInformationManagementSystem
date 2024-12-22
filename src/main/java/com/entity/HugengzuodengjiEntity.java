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
 * 户耕作登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
@TableName("hugengzuodengji")
public class HugengzuodengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HugengzuodengjiEntity() {
		
	}
	
	public HugengzuodengjiEntity(T t) {
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
	 * 耕作单号
	 */
					
	private String gengzuodanhao;
	
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
	 * 设置：耕作单号
	 */
	public void setGengzuodanhao(String gengzuodanhao) {
		this.gengzuodanhao = gengzuodanhao;
	}
	/**
	 * 获取：耕作单号
	 */
	public String getGengzuodanhao() {
		return gengzuodanhao;
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
