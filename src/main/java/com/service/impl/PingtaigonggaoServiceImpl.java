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


import com.dao.PingtaigonggaoDao;
import com.entity.PingtaigonggaoEntity;
import com.service.PingtaigonggaoService;
import com.entity.vo.PingtaigonggaoVO;
import com.entity.view.PingtaigonggaoView;

@Service("pingtaigonggaoService")
public class PingtaigonggaoServiceImpl extends ServiceImpl<PingtaigonggaoDao, PingtaigonggaoEntity> implements PingtaigonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PingtaigonggaoEntity> page = this.selectPage(
                new Query<PingtaigonggaoEntity>(params).getPage(),
                new EntityWrapper<PingtaigonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PingtaigonggaoEntity> wrapper) {
		  Page<PingtaigonggaoView> page =new Query<PingtaigonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PingtaigonggaoVO> selectListVO(Wrapper<PingtaigonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PingtaigonggaoVO selectVO(Wrapper<PingtaigonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PingtaigonggaoView> selectListView(Wrapper<PingtaigonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PingtaigonggaoView selectView(Wrapper<PingtaigonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
