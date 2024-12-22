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


import com.dao.QijianxiaoshoutongjiDao;
import com.entity.QijianxiaoshoutongjiEntity;
import com.service.QijianxiaoshoutongjiService;
import com.entity.vo.QijianxiaoshoutongjiVO;
import com.entity.view.QijianxiaoshoutongjiView;

@Service("qijianxiaoshoutongjiService")
public class QijianxiaoshoutongjiServiceImpl extends ServiceImpl<QijianxiaoshoutongjiDao, QijianxiaoshoutongjiEntity> implements QijianxiaoshoutongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QijianxiaoshoutongjiEntity> page = this.selectPage(
                new Query<QijianxiaoshoutongjiEntity>(params).getPage(),
                new EntityWrapper<QijianxiaoshoutongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QijianxiaoshoutongjiEntity> wrapper) {
		  Page<QijianxiaoshoutongjiView> page =new Query<QijianxiaoshoutongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QijianxiaoshoutongjiVO> selectListVO(Wrapper<QijianxiaoshoutongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QijianxiaoshoutongjiVO selectVO(Wrapper<QijianxiaoshoutongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QijianxiaoshoutongjiView> selectListView(Wrapper<QijianxiaoshoutongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QijianxiaoshoutongjiView selectView(Wrapper<QijianxiaoshoutongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
