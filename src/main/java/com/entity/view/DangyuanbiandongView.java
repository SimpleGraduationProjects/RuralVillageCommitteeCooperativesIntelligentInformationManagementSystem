package com.entity.view;

import com.entity.DangyuanbiandongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 党员变动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
@TableName("dangyuanbiandong")
public class DangyuanbiandongView  extends DangyuanbiandongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DangyuanbiandongView(){
	}
 
 	public DangyuanbiandongView(DangyuanbiandongEntity dangyuanbiandongEntity){
 	try {
			BeanUtils.copyProperties(this, dangyuanbiandongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
