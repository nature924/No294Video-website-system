package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipinpaimingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipinpaimingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinpaimingView;


/**
 * 视频排名
 *
 * @author 
 * @email 
 * @date 2021-04-30 20:41:18
 */
public interface ShipinpaimingService extends IService<ShipinpaimingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipinpaimingVO> selectListVO(Wrapper<ShipinpaimingEntity> wrapper);
   	
   	ShipinpaimingVO selectVO(@Param("ew") Wrapper<ShipinpaimingEntity> wrapper);
   	
   	List<ShipinpaimingView> selectListView(Wrapper<ShipinpaimingEntity> wrapper);
   	
   	ShipinpaimingView selectView(@Param("ew") Wrapper<ShipinpaimingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipinpaimingEntity> wrapper);
   	
}

