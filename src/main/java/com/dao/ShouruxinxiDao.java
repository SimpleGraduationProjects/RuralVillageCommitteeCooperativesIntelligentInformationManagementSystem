package com.dao;

import com.entity.ShouruxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouruxinxiVO;
import com.entity.view.ShouruxinxiView;


/**
 * 收入信息
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface ShouruxinxiDao extends BaseMapper<ShouruxinxiEntity> {
	
	List<ShouruxinxiVO> selectListVO(@Param("ew") Wrapper<ShouruxinxiEntity> wrapper);
	
	ShouruxinxiVO selectVO(@Param("ew") Wrapper<ShouruxinxiEntity> wrapper);
	
	List<ShouruxinxiView> selectListView(@Param("ew") Wrapper<ShouruxinxiEntity> wrapper);

	List<ShouruxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShouruxinxiEntity> wrapper);
	
	ShouruxinxiView selectView(@Param("ew") Wrapper<ShouruxinxiEntity> wrapper);
	
}
