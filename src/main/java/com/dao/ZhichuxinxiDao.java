package com.dao;

import com.entity.ZhichuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhichuxinxiVO;
import com.entity.view.ZhichuxinxiView;


/**
 * 支出信息
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface ZhichuxinxiDao extends BaseMapper<ZhichuxinxiEntity> {
	
	List<ZhichuxinxiVO> selectListVO(@Param("ew") Wrapper<ZhichuxinxiEntity> wrapper);
	
	ZhichuxinxiVO selectVO(@Param("ew") Wrapper<ZhichuxinxiEntity> wrapper);
	
	List<ZhichuxinxiView> selectListView(@Param("ew") Wrapper<ZhichuxinxiEntity> wrapper);

	List<ZhichuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhichuxinxiEntity> wrapper);
	
	ZhichuxinxiView selectView(@Param("ew") Wrapper<ZhichuxinxiEntity> wrapper);
	
}
