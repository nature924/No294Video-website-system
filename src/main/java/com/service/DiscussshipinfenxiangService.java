package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshipinfenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshipinfenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshipinfenxiangView;


/**
 * 视频分享评论表
 *
 * @author 
 * @email 
 * @date 2021-04-30 20:41:19
 */
public interface DiscussshipinfenxiangService extends IService<DiscussshipinfenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshipinfenxiangVO> selectListVO(Wrapper<DiscussshipinfenxiangEntity> wrapper);
   	
   	DiscussshipinfenxiangVO selectVO(@Param("ew") Wrapper<DiscussshipinfenxiangEntity> wrapper);
   	
   	List<DiscussshipinfenxiangView> selectListView(Wrapper<DiscussshipinfenxiangEntity> wrapper);
   	
   	DiscussshipinfenxiangView selectView(@Param("ew") Wrapper<DiscussshipinfenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshipinfenxiangEntity> wrapper);
   	
}

