package com.dao;

import com.entity.DiscussshipinfenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshipinfenxiangVO;
import com.entity.view.DiscussshipinfenxiangView;


/**
 * 视频分享评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-30 20:41:19
 */
public interface DiscussshipinfenxiangDao extends BaseMapper<DiscussshipinfenxiangEntity> {
	
	List<DiscussshipinfenxiangVO> selectListVO(@Param("ew") Wrapper<DiscussshipinfenxiangEntity> wrapper);
	
	DiscussshipinfenxiangVO selectVO(@Param("ew") Wrapper<DiscussshipinfenxiangEntity> wrapper);
	
	List<DiscussshipinfenxiangView> selectListView(@Param("ew") Wrapper<DiscussshipinfenxiangEntity> wrapper);

	List<DiscussshipinfenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshipinfenxiangEntity> wrapper);
	
	DiscussshipinfenxiangView selectView(@Param("ew") Wrapper<DiscussshipinfenxiangEntity> wrapper);
	
}
