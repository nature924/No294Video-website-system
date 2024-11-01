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


import com.dao.ShipinpaimingDao;
import com.entity.ShipinpaimingEntity;
import com.service.ShipinpaimingService;
import com.entity.vo.ShipinpaimingVO;
import com.entity.view.ShipinpaimingView;

@Service("shipinpaimingService")
public class ShipinpaimingServiceImpl extends ServiceImpl<ShipinpaimingDao, ShipinpaimingEntity> implements ShipinpaimingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShipinpaimingEntity> page = this.selectPage(
                new Query<ShipinpaimingEntity>(params).getPage(),
                new EntityWrapper<ShipinpaimingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShipinpaimingEntity> wrapper) {
		  Page<ShipinpaimingView> page =new Query<ShipinpaimingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShipinpaimingVO> selectListVO(Wrapper<ShipinpaimingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShipinpaimingVO selectVO(Wrapper<ShipinpaimingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShipinpaimingView> selectListView(Wrapper<ShipinpaimingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShipinpaimingView selectView(Wrapper<ShipinpaimingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
