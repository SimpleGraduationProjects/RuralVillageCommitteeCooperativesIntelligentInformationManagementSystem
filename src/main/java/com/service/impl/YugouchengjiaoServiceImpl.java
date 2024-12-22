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


import com.dao.YugouchengjiaoDao;
import com.entity.YugouchengjiaoEntity;
import com.service.YugouchengjiaoService;
import com.entity.vo.YugouchengjiaoVO;
import com.entity.view.YugouchengjiaoView;

@Service("yugouchengjiaoService")
public class YugouchengjiaoServiceImpl extends ServiceImpl<YugouchengjiaoDao, YugouchengjiaoEntity> implements YugouchengjiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YugouchengjiaoEntity> page = this.selectPage(
                new Query<YugouchengjiaoEntity>(params).getPage(),
                new EntityWrapper<YugouchengjiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YugouchengjiaoEntity> wrapper) {
		  Page<YugouchengjiaoView> page =new Query<YugouchengjiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YugouchengjiaoVO> selectListVO(Wrapper<YugouchengjiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YugouchengjiaoVO selectVO(Wrapper<YugouchengjiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YugouchengjiaoView> selectListView(Wrapper<YugouchengjiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YugouchengjiaoView selectView(Wrapper<YugouchengjiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
