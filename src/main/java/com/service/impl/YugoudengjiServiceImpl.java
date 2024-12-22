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


import com.dao.YugoudengjiDao;
import com.entity.YugoudengjiEntity;
import com.service.YugoudengjiService;
import com.entity.vo.YugoudengjiVO;
import com.entity.view.YugoudengjiView;

@Service("yugoudengjiService")
public class YugoudengjiServiceImpl extends ServiceImpl<YugoudengjiDao, YugoudengjiEntity> implements YugoudengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YugoudengjiEntity> page = this.selectPage(
                new Query<YugoudengjiEntity>(params).getPage(),
                new EntityWrapper<YugoudengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YugoudengjiEntity> wrapper) {
		  Page<YugoudengjiView> page =new Query<YugoudengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YugoudengjiVO> selectListVO(Wrapper<YugoudengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YugoudengjiVO selectVO(Wrapper<YugoudengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YugoudengjiView> selectListView(Wrapper<YugoudengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YugoudengjiView selectView(Wrapper<YugoudengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
