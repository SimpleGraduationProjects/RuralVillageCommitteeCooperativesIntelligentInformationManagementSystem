package com.dao;

import com.entity.ShiwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiwuVO;
import com.entity.view.ShiwuView;


/**
 * 事务
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
public interface ShiwuDao extends BaseMapper<ShiwuEntity> {
	
	List<ShiwuVO> selectListVO(@Param("ew") Wrapper<ShiwuEntity> wrapper);
	
	ShiwuVO selectVO(@Param("ew") Wrapper<ShiwuEntity> wrapper);
	
	List<ShiwuView> selectListView(@Param("ew") Wrapper<ShiwuEntity> wrapper);

	List<ShiwuView> selectListView(Pagination page,@Param("ew") Wrapper<ShiwuEntity> wrapper);
	
	ShiwuView selectView(@Param("ew") Wrapper<ShiwuEntity> wrapper);
	
}
