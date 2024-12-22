package com.entity.view;

import com.entity.FazhandangyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 发展党员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
@TableName("fazhandangyuan")
public class FazhandangyuanView  extends FazhandangyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FazhandangyuanView(){
	}
 
 	public FazhandangyuanView(FazhandangyuanEntity fazhandangyuanEntity){
 	try {
			BeanUtils.copyProperties(this, fazhandangyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
