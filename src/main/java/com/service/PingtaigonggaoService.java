package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PingtaigonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PingtaigonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PingtaigonggaoView;


/**
 * 平台公告
 *
 * @author 
 * @email 
 * @date 2021-04-30 20:41:18
 */
public interface PingtaigonggaoService extends IService<PingtaigonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PingtaigonggaoVO> selectListVO(Wrapper<PingtaigonggaoEntity> wrapper);
   	
   	PingtaigonggaoVO selectVO(@Param("ew") Wrapper<PingtaigonggaoEntity> wrapper);
   	
   	List<PingtaigonggaoView> selectListView(Wrapper<PingtaigonggaoEntity> wrapper);
   	
   	PingtaigonggaoView selectView(@Param("ew") Wrapper<PingtaigonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PingtaigonggaoEntity> wrapper);
   	
}

