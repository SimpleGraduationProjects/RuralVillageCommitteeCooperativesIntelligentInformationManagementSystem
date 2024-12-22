package com.dao;

import com.entity.YugouchengjiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YugouchengjiaoVO;
import com.entity.view.YugouchengjiaoView;


/**
 * 预购成交
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface YugouchengjiaoDao extends BaseMapper<YugouchengjiaoEntity> {
	
	List<YugouchengjiaoVO> selectListVO(@Param("ew") Wrapper<YugouchengjiaoEntity> wrapper);
	
	YugouchengjiaoVO selectVO(@Param("ew") Wrapper<YugouchengjiaoEntity> wrapper);
	
	List<YugouchengjiaoView> selectListView(@Param("ew") Wrapper<YugouchengjiaoEntity> wrapper);

	List<YugouchengjiaoView> selectListView(Pagination page,@Param("ew") Wrapper<YugouchengjiaoEntity> wrapper);
	
	YugouchengjiaoView selectView(@Param("ew") Wrapper<YugouchengjiaoEntity> wrapper);
	
}
