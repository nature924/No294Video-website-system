package com.entity.view;

import com.entity.DiscussshipinpaimingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 视频排名评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 20:41:19
 */
@TableName("discussshipinpaiming")
public class DiscussshipinpaimingView  extends DiscussshipinpaimingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshipinpaimingView(){
	}
 
 	public DiscussshipinpaimingView(DiscussshipinpaimingEntity discussshipinpaimingEntity){
 	try {
			BeanUtils.copyProperties(this, discussshipinpaimingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
