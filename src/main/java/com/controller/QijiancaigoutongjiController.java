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

import com.entity.QijiancaigoutongjiEntity;
import com.entity.view.QijiancaigoutongjiView;

import com.service.QijiancaigoutongjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 期间采购统计
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
@RestController
@RequestMapping("/qijiancaigoutongji")
public class QijiancaigoutongjiController {
    @Autowired
    private QijiancaigoutongjiService qijiancaigoutongjiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QijiancaigoutongjiEntity qijiancaigoutongji, 
                @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date caigoushijianstart,
                @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date caigoushijianend,
		HttpServletRequest request){

        EntityWrapper<QijiancaigoutongjiEntity> ew = new EntityWrapper<QijiancaigoutongjiEntity>();
                if(caigoushijianstart!=null) ew.ge("caigoushijian", caigoushijianstart);
                if(caigoushijianend!=null) ew.le("caigoushijian", caigoushijianend);
		PageUtils page = qijiancaigoutongjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qijiancaigoutongji), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QijiancaigoutongjiEntity qijiancaigoutongji, HttpServletRequest request){
        EntityWrapper<QijiancaigoutongjiEntity> ew = new EntityWrapper<QijiancaigoutongjiEntity>();
		PageUtils page = qijiancaigoutongjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qijiancaigoutongji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QijiancaigoutongjiEntity qijiancaigoutongji){
       	EntityWrapper<QijiancaigoutongjiEntity> ew = new EntityWrapper<QijiancaigoutongjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qijiancaigoutongji, "qijiancaigoutongji")); 
        return R.ok().put("data", qijiancaigoutongjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QijiancaigoutongjiEntity qijiancaigoutongji){
        EntityWrapper< QijiancaigoutongjiEntity> ew = new EntityWrapper< QijiancaigoutongjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qijiancaigoutongji, "qijiancaigoutongji")); 
		QijiancaigoutongjiView qijiancaigoutongjiView =  qijiancaigoutongjiService.selectView(ew);
		return R.ok("查询期间采购统计成功").put("data", qijiancaigoutongjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QijiancaigoutongjiEntity qijiancaigoutongji = qijiancaigoutongjiService.selectById(id);
        return R.ok().put("data", qijiancaigoutongji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QijiancaigoutongjiEntity qijiancaigoutongji = qijiancaigoutongjiService.selectById(id);
        return R.ok().put("data", qijiancaigoutongji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QijiancaigoutongjiEntity qijiancaigoutongji, HttpServletRequest request){
    	qijiancaigoutongji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qijiancaigoutongji);

        qijiancaigoutongjiService.insert(qijiancaigoutongji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QijiancaigoutongjiEntity qijiancaigoutongji, HttpServletRequest request){
    	qijiancaigoutongji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qijiancaigoutongji);

        qijiancaigoutongjiService.insert(qijiancaigoutongji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QijiancaigoutongjiEntity qijiancaigoutongji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qijiancaigoutongji);
        qijiancaigoutongjiService.updateById(qijiancaigoutongji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qijiancaigoutongjiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<QijiancaigoutongjiEntity> wrapper = new EntityWrapper<QijiancaigoutongjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = qijiancaigoutongjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
