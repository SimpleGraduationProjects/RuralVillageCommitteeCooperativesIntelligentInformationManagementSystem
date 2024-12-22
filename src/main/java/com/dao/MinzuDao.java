package com.dao;

import com.entity.MinzuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MinzuVO;
import com.entity.view.MinzuView;


/**
 * 民族
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface MinzuDao extends BaseMapper<MinzuEntity> {
	
	List<MinzuVO> selectListVO(@Param("ew") Wrapper<MinzuEntity> wrapper);
	
	MinzuVO selectVO(@Param("ew") Wrapper<MinzuEntity> wrapper);
	
	List<MinzuView> selectListView(@Param("ew") Wrapper<MinzuEntity> wrapper);

	List<MinzuView> selectListView(Pagination page,@Param("ew") Wrapper<MinzuEntity> wrapper);
	
	MinzuView selectView(@Param("ew") Wrapper<MinzuEntity> wrapper);
	
}
