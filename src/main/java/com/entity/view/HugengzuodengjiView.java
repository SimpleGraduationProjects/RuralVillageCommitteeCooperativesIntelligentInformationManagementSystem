package com.entity.view;

import com.entity.HugengzuodengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 户耕作登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
@TableName("hugengzuodengji")
public class HugengzuodengjiView  extends HugengzuodengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HugengzuodengjiView(){
	}
 
 	public HugengzuodengjiView(HugengzuodengjiEntity hugengzuodengjiEntity){
 	try {
			BeanUtils.copyProperties(this, hugengzuodengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
