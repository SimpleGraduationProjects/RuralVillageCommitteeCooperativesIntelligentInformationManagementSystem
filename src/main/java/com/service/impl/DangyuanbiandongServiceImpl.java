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


import com.dao.DangyuanbiandongDao;
import com.entity.DangyuanbiandongEntity;
import com.service.DangyuanbiandongService;
import com.entity.vo.DangyuanbiandongVO;
import com.entity.view.DangyuanbiandongView;

@Service("dangyuanbiandongService")
public class DangyuanbiandongServiceImpl extends ServiceImpl<DangyuanbiandongDao, DangyuanbiandongEntity> implements DangyuanbiandongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangyuanbiandongEntity> page = this.selectPage(
                new Query<DangyuanbiandongEntity>(params).getPage(),
                new EntityWrapper<DangyuanbiandongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangyuanbiandongEntity> wrapper) {
		  Page<DangyuanbiandongView> page =new Query<DangyuanbiandongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangyuanbiandongVO> selectListVO(Wrapper<DangyuanbiandongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangyuanbiandongVO selectVO(Wrapper<DangyuanbiandongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangyuanbiandongView> selectListView(Wrapper<DangyuanbiandongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangyuanbiandongView selectView(Wrapper<DangyuanbiandongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
