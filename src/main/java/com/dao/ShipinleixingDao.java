package com.dao;

import com.entity.ShipinleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipinleixingVO;
import com.entity.view.ShipinleixingView;


/**
 * 视频类型
 * 
 * @author 
 * @email 
 * @date 2021-04-30 20:41:18
 */
public interface ShipinleixingDao extends BaseMapper<ShipinleixingEntity> {
	
	List<ShipinleixingVO> selectListVO(@Param("ew") Wrapper<ShipinleixingEntity> wrapper);
	
	ShipinleixingVO selectVO(@Param("ew") Wrapper<ShipinleixingEntity> wrapper);
	
	List<ShipinleixingView> selectListView(@Param("ew") Wrapper<ShipinleixingEntity> wrapper);

	List<ShipinleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ShipinleixingEntity> wrapper);
	
	ShipinleixingView selectView(@Param("ew") Wrapper<ShipinleixingEntity> wrapper);
	
}
