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


import com.dao.ShiwuDao;
import com.entity.ShiwuEntity;
import com.service.ShiwuService;
import com.entity.vo.ShiwuVO;
import com.entity.view.ShiwuView;

@Service("shiwuService")
public class ShiwuServiceImpl extends ServiceImpl<ShiwuDao, ShiwuEntity> implements ShiwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiwuEntity> page = this.selectPage(
                new Query<ShiwuEntity>(params).getPage(),
                new EntityWrapper<ShiwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiwuEntity> wrapper) {
		  Page<ShiwuView> page =new Query<ShiwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiwuVO> selectListVO(Wrapper<ShiwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiwuVO selectVO(Wrapper<ShiwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiwuView> selectListView(Wrapper<ShiwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiwuView selectView(Wrapper<ShiwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
