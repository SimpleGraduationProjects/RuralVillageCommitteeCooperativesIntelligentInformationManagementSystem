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


import com.dao.HezuoshechengyuanDao;
import com.entity.HezuoshechengyuanEntity;
import com.service.HezuoshechengyuanService;
import com.entity.vo.HezuoshechengyuanVO;
import com.entity.view.HezuoshechengyuanView;

@Service("hezuoshechengyuanService")
public class HezuoshechengyuanServiceImpl extends ServiceImpl<HezuoshechengyuanDao, HezuoshechengyuanEntity> implements HezuoshechengyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HezuoshechengyuanEntity> page = this.selectPage(
                new Query<HezuoshechengyuanEntity>(params).getPage(),
                new EntityWrapper<HezuoshechengyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HezuoshechengyuanEntity> wrapper) {
		  Page<HezuoshechengyuanView> page =new Query<HezuoshechengyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HezuoshechengyuanVO> selectListVO(Wrapper<HezuoshechengyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HezuoshechengyuanVO selectVO(Wrapper<HezuoshechengyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HezuoshechengyuanView> selectListView(Wrapper<HezuoshechengyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HezuoshechengyuanView selectView(Wrapper<HezuoshechengyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
