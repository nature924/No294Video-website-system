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


import com.dao.DiscussshipinpaimingDao;
import com.entity.DiscussshipinpaimingEntity;
import com.service.DiscussshipinpaimingService;
import com.entity.vo.DiscussshipinpaimingVO;
import com.entity.view.DiscussshipinpaimingView;

@Service("discussshipinpaimingService")
public class DiscussshipinpaimingServiceImpl extends ServiceImpl<DiscussshipinpaimingDao, DiscussshipinpaimingEntity> implements DiscussshipinpaimingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshipinpaimingEntity> page = this.selectPage(
                new Query<DiscussshipinpaimingEntity>(params).getPage(),
                new EntityWrapper<DiscussshipinpaimingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshipinpaimingEntity> wrapper) {
		  Page<DiscussshipinpaimingView> page =new Query<DiscussshipinpaimingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshipinpaimingVO> selectListVO(Wrapper<DiscussshipinpaimingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshipinpaimingVO selectVO(Wrapper<DiscussshipinpaimingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshipinpaimingView> selectListView(Wrapper<DiscussshipinpaimingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshipinpaimingView selectView(Wrapper<DiscussshipinpaimingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
