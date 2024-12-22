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


import com.dao.ShouruxinxiDao;
import com.entity.ShouruxinxiEntity;
import com.service.ShouruxinxiService;
import com.entity.vo.ShouruxinxiVO;
import com.entity.view.ShouruxinxiView;

@Service("shouruxinxiService")
public class ShouruxinxiServiceImpl extends ServiceImpl<ShouruxinxiDao, ShouruxinxiEntity> implements ShouruxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouruxinxiEntity> page = this.selectPage(
                new Query<ShouruxinxiEntity>(params).getPage(),
                new EntityWrapper<ShouruxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouruxinxiEntity> wrapper) {
		  Page<ShouruxinxiView> page =new Query<ShouruxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouruxinxiVO> selectListVO(Wrapper<ShouruxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouruxinxiVO selectVO(Wrapper<ShouruxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouruxinxiView> selectListView(Wrapper<ShouruxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouruxinxiView selectView(Wrapper<ShouruxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
