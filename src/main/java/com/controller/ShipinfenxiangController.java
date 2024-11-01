package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShipinfenxiangEntity;
import com.entity.view.ShipinfenxiangView;

import com.service.ShipinfenxiangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 视频分享
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-30 20:41:18
 */
@RestController
@RequestMapping("/shipinfenxiang")
public class ShipinfenxiangController {
    @Autowired
    private ShipinfenxiangService shipinfenxiangService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShipinfenxiangEntity shipinfenxiang,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shipinfenxiang.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShipinfenxiangEntity> ew = new EntityWrapper<ShipinfenxiangEntity>();
		PageUtils page = shipinfenxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shipinfenxiang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShipinfenxiangEntity shipinfenxiang, 
		HttpServletRequest request){
        EntityWrapper<ShipinfenxiangEntity> ew = new EntityWrapper<ShipinfenxiangEntity>();
		PageUtils page = shipinfenxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shipinfenxiang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShipinfenxiangEntity shipinfenxiang){
       	EntityWrapper<ShipinfenxiangEntity> ew = new EntityWrapper<ShipinfenxiangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shipinfenxiang, "shipinfenxiang")); 
        return R.ok().put("data", shipinfenxiangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShipinfenxiangEntity shipinfenxiang){
        EntityWrapper< ShipinfenxiangEntity> ew = new EntityWrapper< ShipinfenxiangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shipinfenxiang, "shipinfenxiang")); 
		ShipinfenxiangView shipinfenxiangView =  shipinfenxiangService.selectView(ew);
		return R.ok("查询视频分享成功").put("data", shipinfenxiangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShipinfenxiangEntity shipinfenxiang = shipinfenxiangService.selectById(id);
		shipinfenxiang.setClicknum(shipinfenxiang.getClicknum()+1);
		shipinfenxiang.setClicktime(new Date());
		shipinfenxiangService.updateById(shipinfenxiang);
        return R.ok().put("data", shipinfenxiang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShipinfenxiangEntity shipinfenxiang = shipinfenxiangService.selectById(id);
		shipinfenxiang.setClicknum(shipinfenxiang.getClicknum()+1);
		shipinfenxiang.setClicktime(new Date());
		shipinfenxiangService.updateById(shipinfenxiang);
        return R.ok().put("data", shipinfenxiang);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        ShipinfenxiangEntity shipinfenxiang = shipinfenxiangService.selectById(id);
        if(type.equals("1")) {
        	shipinfenxiang.setThumbsupnum(shipinfenxiang.getThumbsupnum()+1);
        } else {
        	shipinfenxiang.setCrazilynum(shipinfenxiang.getCrazilynum()+1);
        }
        shipinfenxiangService.updateById(shipinfenxiang);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShipinfenxiangEntity shipinfenxiang, HttpServletRequest request){
    	shipinfenxiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shipinfenxiang);
        shipinfenxiangService.insert(shipinfenxiang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShipinfenxiangEntity shipinfenxiang, HttpServletRequest request){
    	shipinfenxiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shipinfenxiang);
        shipinfenxiangService.insert(shipinfenxiang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShipinfenxiangEntity shipinfenxiang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shipinfenxiang);
        shipinfenxiangService.updateById(shipinfenxiang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shipinfenxiangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShipinfenxiangEntity> wrapper = new EntityWrapper<ShipinfenxiangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shipinfenxiangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ShipinfenxiangEntity shipinfenxiang, HttpServletRequest request,String pre){
        EntityWrapper<ShipinfenxiangEntity> ew = new EntityWrapper<ShipinfenxiangEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = shipinfenxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shipinfenxiang), params), params));
        return R.ok().put("data", page);
    }


}
