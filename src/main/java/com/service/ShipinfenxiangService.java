package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipinfenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipinfenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinfenxiangView;


/**
 * 视频分享
 *
 * @author 
 * @email 
 * @date 2021-04-30 20:41:18
 */
public interface ShipinfenxiangService extends IService<ShipinfenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipinfenxiangVO> selectListVO(Wrapper<ShipinfenxiangEntity> wrapper);
   	
   	ShipinfenxiangVO selectVO(@Param("ew") Wrapper<ShipinfenxiangEntity> wrapper);
   	
   	List<ShipinfenxiangView> selectListView(Wrapper<ShipinfenxiangEntity> wrapper);
   	
   	ShipinfenxiangView selectView(@Param("ew") Wrapper<ShipinfenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipinfenxiangEntity> wrapper);
   	
}

