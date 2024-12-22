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


import com.dao.HugengzuodengjiDao;
import com.entity.HugengzuodengjiEntity;
import com.service.HugengzuodengjiService;
import com.entity.vo.HugengzuodengjiVO;
import com.entity.view.HugengzuodengjiView;

@Service("hugengzuodengjiService")
public class HugengzuodengjiServiceImpl extends ServiceImpl<HugengzuodengjiDao, HugengzuodengjiEntity> implements HugengzuodengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HugengzuodengjiEntity> page = this.selectPage(
                new Query<HugengzuodengjiEntity>(params).getPage(),
                new EntityWrapper<HugengzuodengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HugengzuodengjiEntity> wrapper) {
		  Page<HugengzuodengjiView> page =new Query<HugengzuodengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HugengzuodengjiVO> selectListVO(Wrapper<HugengzuodengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HugengzuodengjiVO selectVO(Wrapper<HugengzuodengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HugengzuodengjiView> selectListView(Wrapper<HugengzuodengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HugengzuodengjiView selectView(Wrapper<HugengzuodengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
