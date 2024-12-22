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


import com.dao.QijiancaigoutongjiDao;
import com.entity.QijiancaigoutongjiEntity;
import com.service.QijiancaigoutongjiService;
import com.entity.vo.QijiancaigoutongjiVO;
import com.entity.view.QijiancaigoutongjiView;

@Service("qijiancaigoutongjiService")
public class QijiancaigoutongjiServiceImpl extends ServiceImpl<QijiancaigoutongjiDao, QijiancaigoutongjiEntity> implements QijiancaigoutongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QijiancaigoutongjiEntity> page = this.selectPage(
                new Query<QijiancaigoutongjiEntity>(params).getPage(),
                new EntityWrapper<QijiancaigoutongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QijiancaigoutongjiEntity> wrapper) {
		  Page<QijiancaigoutongjiView> page =new Query<QijiancaigoutongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QijiancaigoutongjiVO> selectListVO(Wrapper<QijiancaigoutongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QijiancaigoutongjiVO selectVO(Wrapper<QijiancaigoutongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QijiancaigoutongjiView> selectListView(Wrapper<QijiancaigoutongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QijiancaigoutongjiView selectView(Wrapper<QijiancaigoutongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
