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


import com.dao.XueliDao;
import com.entity.XueliEntity;
import com.service.XueliService;
import com.entity.vo.XueliVO;
import com.entity.view.XueliView;

@Service("xueliService")
public class XueliServiceImpl extends ServiceImpl<XueliDao, XueliEntity> implements XueliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueliEntity> page = this.selectPage(
                new Query<XueliEntity>(params).getPage(),
                new EntityWrapper<XueliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueliEntity> wrapper) {
		  Page<XueliView> page =new Query<XueliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueliVO> selectListVO(Wrapper<XueliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueliVO selectVO(Wrapper<XueliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueliView> selectListView(Wrapper<XueliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueliView selectView(Wrapper<XueliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
