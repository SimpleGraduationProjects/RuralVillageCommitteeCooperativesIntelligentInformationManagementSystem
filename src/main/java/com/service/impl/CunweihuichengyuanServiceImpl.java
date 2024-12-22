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


import com.dao.CunweihuichengyuanDao;
import com.entity.CunweihuichengyuanEntity;
import com.service.CunweihuichengyuanService;
import com.entity.vo.CunweihuichengyuanVO;
import com.entity.view.CunweihuichengyuanView;

@Service("cunweihuichengyuanService")
public class CunweihuichengyuanServiceImpl extends ServiceImpl<CunweihuichengyuanDao, CunweihuichengyuanEntity> implements CunweihuichengyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CunweihuichengyuanEntity> page = this.selectPage(
                new Query<CunweihuichengyuanEntity>(params).getPage(),
                new EntityWrapper<CunweihuichengyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CunweihuichengyuanEntity> wrapper) {
		  Page<CunweihuichengyuanView> page =new Query<CunweihuichengyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CunweihuichengyuanVO> selectListVO(Wrapper<CunweihuichengyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CunweihuichengyuanVO selectVO(Wrapper<CunweihuichengyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CunweihuichengyuanView> selectListView(Wrapper<CunweihuichengyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CunweihuichengyuanView selectView(Wrapper<CunweihuichengyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
