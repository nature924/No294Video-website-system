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


import com.dao.ShipinfenxiangDao;
import com.entity.ShipinfenxiangEntity;
import com.service.ShipinfenxiangService;
import com.entity.vo.ShipinfenxiangVO;
import com.entity.view.ShipinfenxiangView;

@Service("shipinfenxiangService")
public class ShipinfenxiangServiceImpl extends ServiceImpl<ShipinfenxiangDao, ShipinfenxiangEntity> implements ShipinfenxiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShipinfenxiangEntity> page = this.selectPage(
                new Query<ShipinfenxiangEntity>(params).getPage(),
                new EntityWrapper<ShipinfenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShipinfenxiangEntity> wrapper) {
		  Page<ShipinfenxiangView> page =new Query<ShipinfenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShipinfenxiangVO> selectListVO(Wrapper<ShipinfenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShipinfenxiangVO selectVO(Wrapper<ShipinfenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShipinfenxiangView> selectListView(Wrapper<ShipinfenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShipinfenxiangView selectView(Wrapper<ShipinfenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
