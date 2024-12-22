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


import com.dao.CunminDao;
import com.entity.CunminEntity;
import com.service.CunminService;
import com.entity.vo.CunminVO;
import com.entity.view.CunminView;

@Service("cunminService")
public class CunminServiceImpl extends ServiceImpl<CunminDao, CunminEntity> implements CunminService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CunminEntity> page = this.selectPage(
                new Query<CunminEntity>(params).getPage(),
                new EntityWrapper<CunminEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CunminEntity> wrapper) {
		  Page<CunminView> page =new Query<CunminView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CunminVO> selectListVO(Wrapper<CunminEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CunminVO selectVO(Wrapper<CunminEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CunminView> selectListView(Wrapper<CunminEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CunminView selectView(Wrapper<CunminEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
