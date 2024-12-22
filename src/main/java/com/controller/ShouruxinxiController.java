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

import com.entity.ShouruxinxiEntity;
import com.entity.view.ShouruxinxiView;

import com.service.ShouruxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 收入信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
@RestController
@RequestMapping("/shouruxinxi")
public class ShouruxinxiController {
    @Autowired
    private ShouruxinxiService shouruxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShouruxinxiEntity shouruxinxi, 
                @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date riqiend,
		HttpServletRequest request){

        EntityWrapper<ShouruxinxiEntity> ew = new EntityWrapper<ShouruxinxiEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);
		PageUtils page = shouruxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shouruxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShouruxinxiEntity shouruxinxi, HttpServletRequest request){
        EntityWrapper<ShouruxinxiEntity> ew = new EntityWrapper<ShouruxinxiEntity>();
		PageUtils page = shouruxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shouruxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShouruxinxiEntity shouruxinxi){
       	EntityWrapper<ShouruxinxiEntity> ew = new EntityWrapper<ShouruxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shouruxinxi, "shouruxinxi")); 
        return R.ok().put("data", shouruxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShouruxinxiEntity shouruxinxi){
        EntityWrapper< ShouruxinxiEntity> ew = new EntityWrapper< ShouruxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shouruxinxi, "shouruxinxi")); 
		ShouruxinxiView shouruxinxiView =  shouruxinxiService.selectView(ew);
		return R.ok("查询收入信息成功").put("data", shouruxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShouruxinxiEntity shouruxinxi = shouruxinxiService.selectById(id);
        return R.ok().put("data", shouruxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShouruxinxiEntity shouruxinxi = shouruxinxiService.selectById(id);
        return R.ok().put("data", shouruxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShouruxinxiEntity shouruxinxi, HttpServletRequest request){
    	shouruxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shouruxinxi);

        shouruxinxiService.insert(shouruxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShouruxinxiEntity shouruxinxi, HttpServletRequest request){
    	shouruxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shouruxinxi);

        shouruxinxiService.insert(shouruxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShouruxinxiEntity shouruxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shouruxinxi);
        shouruxinxiService.updateById(shouruxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shouruxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShouruxinxiEntity> wrapper = new EntityWrapper<ShouruxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shouruxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
