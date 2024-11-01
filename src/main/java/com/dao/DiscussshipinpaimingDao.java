package com.dao;

import com.entity.DiscussshipinpaimingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshipinpaimingVO;
import com.entity.view.DiscussshipinpaimingView;


/**
 * 视频排名评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-30 20:41:19
 */
public interface DiscussshipinpaimingDao extends BaseMapper<DiscussshipinpaimingEntity> {
	
	List<DiscussshipinpaimingVO> selectListVO(@Param("ew") Wrapper<DiscussshipinpaimingEntity> wrapper);
	
	DiscussshipinpaimingVO selectVO(@Param("ew") Wrapper<DiscussshipinpaimingEntity> wrapper);
	
	List<DiscussshipinpaimingView> selectListView(@Param("ew") Wrapper<DiscussshipinpaimingEntity> wrapper);

	List<DiscussshipinpaimingView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshipinpaimingEntity> wrapper);
	
	DiscussshipinpaimingView selectView(@Param("ew") Wrapper<DiscussshipinpaimingEntity> wrapper);
	
}
