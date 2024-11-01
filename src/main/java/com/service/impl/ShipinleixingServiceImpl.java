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


import com.dao.ShipinleixingDao;
import com.entity.ShipinleixingEntity;
import com.service.ShipinleixingService;
import com.entity.vo.ShipinleixingVO;
import com.entity.view.ShipinleixingView;

@Service("shipinleixingService")
public class ShipinleixingServiceImpl extends ServiceImpl<ShipinleixingDao, ShipinleixingEntity> implements ShipinleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShipinleixingEntity> page = this.selectPage(
                new Query<ShipinleixingEntity>(params).getPage(),
                new EntityWrapper<ShipinleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShipinleixingEntity> wrapper) {
		  Page<ShipinleixingView> page =new Query<ShipinleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShipinleixingVO> selectListVO(Wrapper<ShipinleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShipinleixingVO selectVO(Wrapper<ShipinleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShipinleixingView> selectListView(Wrapper<ShipinleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShipinleixingView selectView(Wrapper<ShipinleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
