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


import com.dao.YushoudengjiDao;
import com.entity.YushoudengjiEntity;
import com.service.YushoudengjiService;
import com.entity.vo.YushoudengjiVO;
import com.entity.view.YushoudengjiView;

@Service("yushoudengjiService")
public class YushoudengjiServiceImpl extends ServiceImpl<YushoudengjiDao, YushoudengjiEntity> implements YushoudengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YushoudengjiEntity> page = this.selectPage(
                new Query<YushoudengjiEntity>(params).getPage(),
                new EntityWrapper<YushoudengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YushoudengjiEntity> wrapper) {
		  Page<YushoudengjiView> page =new Query<YushoudengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YushoudengjiVO> selectListVO(Wrapper<YushoudengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YushoudengjiVO selectVO(Wrapper<YushoudengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YushoudengjiView> selectListView(Wrapper<YushoudengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YushoudengjiView selectView(Wrapper<YushoudengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
