package com.dao;

import com.entity.ShipinpaimingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipinpaimingVO;
import com.entity.view.ShipinpaimingView;


/**
 * 视频排名
 * 
 * @author 
 * @email 
 * @date 2021-04-30 20:41:18
 */
public interface ShipinpaimingDao extends BaseMapper<ShipinpaimingEntity> {
	
	List<ShipinpaimingVO> selectListVO(@Param("ew") Wrapper<ShipinpaimingEntity> wrapper);
	
	ShipinpaimingVO selectVO(@Param("ew") Wrapper<ShipinpaimingEntity> wrapper);
	
	List<ShipinpaimingView> selectListView(@Param("ew") Wrapper<ShipinpaimingEntity> wrapper);

	List<ShipinpaimingView> selectListView(Pagination page,@Param("ew") Wrapper<ShipinpaimingEntity> wrapper);
	
	ShipinpaimingView selectView(@Param("ew") Wrapper<ShipinpaimingEntity> wrapper);
	
}
