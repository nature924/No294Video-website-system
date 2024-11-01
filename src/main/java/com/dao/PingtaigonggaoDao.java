package com.dao;

import com.entity.PingtaigonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PingtaigonggaoVO;
import com.entity.view.PingtaigonggaoView;


/**
 * 平台公告
 * 
 * @author 
 * @email 
 * @date 2021-04-30 20:41:18
 */
public interface PingtaigonggaoDao extends BaseMapper<PingtaigonggaoEntity> {
	
	List<PingtaigonggaoVO> selectListVO(@Param("ew") Wrapper<PingtaigonggaoEntity> wrapper);
	
	PingtaigonggaoVO selectVO(@Param("ew") Wrapper<PingtaigonggaoEntity> wrapper);
	
	List<PingtaigonggaoView> selectListView(@Param("ew") Wrapper<PingtaigonggaoEntity> wrapper);

	List<PingtaigonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<PingtaigonggaoEntity> wrapper);
	
	PingtaigonggaoView selectView(@Param("ew") Wrapper<PingtaigonggaoEntity> wrapper);
	
}
