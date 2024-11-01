package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipinleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipinleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinleixingView;


/**
 * 视频类型
 *
 * @author 
 * @email 
 * @date 2021-04-30 20:41:18
 */
public interface ShipinleixingService extends IService<ShipinleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipinleixingVO> selectListVO(Wrapper<ShipinleixingEntity> wrapper);
   	
   	ShipinleixingVO selectVO(@Param("ew") Wrapper<ShipinleixingEntity> wrapper);
   	
   	List<ShipinleixingView> selectListView(Wrapper<ShipinleixingEntity> wrapper);
   	
   	ShipinleixingView selectView(@Param("ew") Wrapper<ShipinleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipinleixingEntity> wrapper);
   	
}

