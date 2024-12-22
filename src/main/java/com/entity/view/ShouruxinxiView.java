package com.entity.view;

import com.entity.ShouruxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 收入信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
@TableName("shouruxinxi")
public class ShouruxinxiView  extends ShouruxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShouruxinxiView(){
	}
 
 	public ShouruxinxiView(ShouruxinxiEntity shouruxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shouruxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
