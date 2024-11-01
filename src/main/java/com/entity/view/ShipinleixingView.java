package com.entity.view;

import com.entity.ShipinleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 视频类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 20:41:18
 */
@TableName("shipinleixing")
public class ShipinleixingView  extends ShipinleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShipinleixingView(){
	}
 
 	public ShipinleixingView(ShipinleixingEntity shipinleixingEntity){
 	try {
			BeanUtils.copyProperties(this, shipinleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
