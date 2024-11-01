package com.entity.view;

import com.entity.DiscussshipinfenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 视频分享评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 20:41:19
 */
@TableName("discussshipinfenxiang")
public class DiscussshipinfenxiangView  extends DiscussshipinfenxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshipinfenxiangView(){
	}
 
 	public DiscussshipinfenxiangView(DiscussshipinfenxiangEntity discussshipinfenxiangEntity){
 	try {
			BeanUtils.copyProperties(this, discussshipinfenxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
