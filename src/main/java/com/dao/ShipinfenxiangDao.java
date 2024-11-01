package com.dao;

import com.entity.ShipinfenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipinfenxiangVO;
import com.entity.view.ShipinfenxiangView;


/**
 * 视频分享
 * 
 * @author 
 * @email 
 * @date 2021-04-30 20:41:18
 */
public interface ShipinfenxiangDao extends BaseMapper<ShipinfenxiangEntity> {
	
	List<ShipinfenxiangVO> selectListVO(@Param("ew") Wrapper<ShipinfenxiangEntity> wrapper);
	
	ShipinfenxiangVO selectVO(@Param("ew") Wrapper<ShipinfenxiangEntity> wrapper);
	
	List<ShipinfenxiangView> selectListView(@Param("ew") Wrapper<ShipinfenxiangEntity> wrapper);

	List<ShipinfenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<ShipinfenxiangEntity> wrapper);
	
	ShipinfenxiangView selectView(@Param("ew") Wrapper<ShipinfenxiangEntity> wrapper);
	
}
