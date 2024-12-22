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


import com.dao.ZhichuxinxiDao;
import com.entity.ZhichuxinxiEntity;
import com.service.ZhichuxinxiService;
import com.entity.vo.ZhichuxinxiVO;
import com.entity.view.ZhichuxinxiView;

@Service("zhichuxinxiService")
public class ZhichuxinxiServiceImpl extends ServiceImpl<ZhichuxinxiDao, ZhichuxinxiEntity> implements ZhichuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhichuxinxiEntity> page = this.selectPage(
                new Query<ZhichuxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhichuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhichuxinxiEntity> wrapper) {
		  Page<ZhichuxinxiView> page =new Query<ZhichuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhichuxinxiVO> selectListVO(Wrapper<ZhichuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhichuxinxiVO selectVO(Wrapper<ZhichuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhichuxinxiView> selectListView(Wrapper<ZhichuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhichuxinxiView selectView(Wrapper<ZhichuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
