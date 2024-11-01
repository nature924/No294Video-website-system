package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshipinpaimingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshipinpaimingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshipinpaimingView;


/**
 * 视频排名评论表
 *
 * @author 
 * @email 
 * @date 2021-04-30 20:41:19
 */
public interface DiscussshipinpaimingService extends IService<DiscussshipinpaimingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshipinpaimingVO> selectListVO(Wrapper<DiscussshipinpaimingEntity> wrapper);
   	
   	DiscussshipinpaimingVO selectVO(@Param("ew") Wrapper<DiscussshipinpaimingEntity> wrapper);
   	
   	List<DiscussshipinpaimingView> selectListView(Wrapper<DiscussshipinpaimingEntity> wrapper);
   	
   	DiscussshipinpaimingView selectView(@Param("ew") Wrapper<DiscussshipinpaimingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshipinpaimingEntity> wrapper);
   	
}

