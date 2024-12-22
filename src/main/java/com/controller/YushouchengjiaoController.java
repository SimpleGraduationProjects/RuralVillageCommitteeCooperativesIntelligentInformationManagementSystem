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

import com.entity.YushouchengjiaoEntity;
import com.entity.view.YushouchengjiaoView;

import com.service.YushouchengjiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 预售成交
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
@RestController
@RequestMapping("/yushouchengjiao")
public class YushouchengjiaoController {
    @Autowired
    private YushouchengjiaoService yushouchengjiaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YushouchengjiaoEntity yushouchengjiao, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("cunmin")) {
			yushouchengjiao.setCunminzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YushouchengjiaoEntity> ew = new EntityWrapper<YushouchengjiaoEntity>();
		PageUtils page = yushouchengjiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yushouchengjiao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YushouchengjiaoEntity yushouchengjiao, HttpServletRequest request){
        EntityWrapper<YushouchengjiaoEntity> ew = new EntityWrapper<YushouchengjiaoEntity>();
		PageUtils page = yushouchengjiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yushouchengjiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YushouchengjiaoEntity yushouchengjiao){
       	EntityWrapper<YushouchengjiaoEntity> ew = new EntityWrapper<YushouchengjiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yushouchengjiao, "yushouchengjiao")); 
        return R.ok().put("data", yushouchengjiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YushouchengjiaoEntity yushouchengjiao){
        EntityWrapper< YushouchengjiaoEntity> ew = new EntityWrapper< YushouchengjiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yushouchengjiao, "yushouchengjiao")); 
		YushouchengjiaoView yushouchengjiaoView =  yushouchengjiaoService.selectView(ew);
		return R.ok("查询预售成交成功").put("data", yushouchengjiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YushouchengjiaoEntity yushouchengjiao = yushouchengjiaoService.selectById(id);
        return R.ok().put("data", yushouchengjiao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YushouchengjiaoEntity yushouchengjiao = yushouchengjiaoService.selectById(id);
        return R.ok().put("data", yushouchengjiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YushouchengjiaoEntity yushouchengjiao, HttpServletRequest request){
    	yushouchengjiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yushouchengjiao);

        yushouchengjiaoService.insert(yushouchengjiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YushouchengjiaoEntity yushouchengjiao, HttpServletRequest request){
    	yushouchengjiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yushouchengjiao);

        yushouchengjiaoService.insert(yushouchengjiao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YushouchengjiaoEntity yushouchengjiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yushouchengjiao);
        yushouchengjiaoService.updateById(yushouchengjiao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yushouchengjiaoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YushouchengjiaoEntity> wrapper = new EntityWrapper<YushouchengjiaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("cunmin")) {
			wrapper.eq("cunminzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yushouchengjiaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
