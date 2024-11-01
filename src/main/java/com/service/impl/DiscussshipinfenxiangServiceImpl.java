package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussshipinfenxiangDao;
import com.entity.DiscussshipinfenxiangEntity;
import com.service.DiscussshipinfenxiangService;
import com.entity.vo.DiscussshipinfenxiangVO;
import com.entity.view.DiscussshipinfenxiangView;

@Service("discussshipinfenxiangService")
public class DiscussshipinfenxiangServiceImpl extends ServiceImpl<DiscussshipinfenxiangDao, DiscussshipinfenxiangEntity> implements DiscussshipinfenxiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshipinfenxiangEntity> page = this.selectPage(
                new Query<DiscussshipinfenxiangEntity>(params).getPage(),
                new EntityWrapper<DiscussshipinfenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshipinfenxiangEntity> wrapper) {
		  Page<DiscussshipinfenxiangView> page =new Query<DiscussshipinfenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshipinfenxiangVO> selectListVO(Wrapper<DiscussshipinfenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshipinfenxiangVO selectVO(Wrapper<DiscussshipinfenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshipinfenxiangView> selectListView(Wrapper<DiscussshipinfenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshipinfenxiangView selectView(Wrapper<DiscussshipinfenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
