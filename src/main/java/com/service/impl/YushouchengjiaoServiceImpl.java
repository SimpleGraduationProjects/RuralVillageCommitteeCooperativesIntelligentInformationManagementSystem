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


import com.dao.YushouchengjiaoDao;
import com.entity.YushouchengjiaoEntity;
import com.service.YushouchengjiaoService;
import com.entity.vo.YushouchengjiaoVO;
import com.entity.view.YushouchengjiaoView;

@Service("yushouchengjiaoService")
public class YushouchengjiaoServiceImpl extends ServiceImpl<YushouchengjiaoDao, YushouchengjiaoEntity> implements YushouchengjiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YushouchengjiaoEntity> page = this.selectPage(
                new Query<YushouchengjiaoEntity>(params).getPage(),
                new EntityWrapper<YushouchengjiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YushouchengjiaoEntity> wrapper) {
		  Page<YushouchengjiaoView> page =new Query<YushouchengjiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YushouchengjiaoVO> selectListVO(Wrapper<YushouchengjiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YushouchengjiaoVO selectVO(Wrapper<YushouchengjiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YushouchengjiaoView> selectListView(Wrapper<YushouchengjiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YushouchengjiaoView selectView(Wrapper<YushouchengjiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
