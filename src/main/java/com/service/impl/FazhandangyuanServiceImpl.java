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


import com.dao.FazhandangyuanDao;
import com.entity.FazhandangyuanEntity;
import com.service.FazhandangyuanService;
import com.entity.vo.FazhandangyuanVO;
import com.entity.view.FazhandangyuanView;

@Service("fazhandangyuanService")
public class FazhandangyuanServiceImpl extends ServiceImpl<FazhandangyuanDao, FazhandangyuanEntity> implements FazhandangyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FazhandangyuanEntity> page = this.selectPage(
                new Query<FazhandangyuanEntity>(params).getPage(),
                new EntityWrapper<FazhandangyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FazhandangyuanEntity> wrapper) {
		  Page<FazhandangyuanView> page =new Query<FazhandangyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FazhandangyuanVO> selectListVO(Wrapper<FazhandangyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FazhandangyuanVO selectVO(Wrapper<FazhandangyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FazhandangyuanView> selectListView(Wrapper<FazhandangyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FazhandangyuanView selectView(Wrapper<FazhandangyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
