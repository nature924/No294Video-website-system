package com.entity.view;

import com.entity.PingtaigonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 平台公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 20:41:18
 */
@TableName("pingtaigonggao")
public class PingtaigonggaoView  extends PingtaigonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PingtaigonggaoView(){
	}
 
 	public PingtaigonggaoView(PingtaigonggaoEntity pingtaigonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, pingtaigonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
