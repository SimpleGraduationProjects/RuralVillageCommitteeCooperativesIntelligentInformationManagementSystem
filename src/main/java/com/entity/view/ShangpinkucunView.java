package com.entity.view;

import com.entity.ShangpinkucunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品库存
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
@TableName("shangpinkucun")
public class ShangpinkucunView  extends ShangpinkucunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinkucunView(){
	}
 
 	public ShangpinkucunView(ShangpinkucunEntity shangpinkucunEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinkucunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
