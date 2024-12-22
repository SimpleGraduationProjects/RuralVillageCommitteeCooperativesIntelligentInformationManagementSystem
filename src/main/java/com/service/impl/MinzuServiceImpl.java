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


import com.dao.MinzuDao;
import com.entity.MinzuEntity;
import com.service.MinzuService;
import com.entity.vo.MinzuVO;
import com.entity.view.MinzuView;

@Service("minzuService")
public class MinzuServiceImpl extends ServiceImpl<MinzuDao, MinzuEntity> implements MinzuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MinzuEntity> page = this.selectPage(
                new Query<MinzuEntity>(params).getPage(),
                new EntityWrapper<MinzuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MinzuEntity> wrapper) {
		  Page<MinzuView> page =new Query<MinzuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MinzuVO> selectListVO(Wrapper<MinzuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MinzuVO selectVO(Wrapper<MinzuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MinzuView> selectListView(Wrapper<MinzuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MinzuView selectView(Wrapper<MinzuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
