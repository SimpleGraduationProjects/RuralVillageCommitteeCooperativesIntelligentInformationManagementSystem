package com.dao;

import com.entity.DangyuanbiandongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangyuanbiandongVO;
import com.entity.view.DangyuanbiandongView;


/**
 * 党员变动
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface DangyuanbiandongDao extends BaseMapper<DangyuanbiandongEntity> {
	
	List<DangyuanbiandongVO> selectListVO(@Param("ew") Wrapper<DangyuanbiandongEntity> wrapper);
	
	DangyuanbiandongVO selectVO(@Param("ew") Wrapper<DangyuanbiandongEntity> wrapper);
	
	List<DangyuanbiandongView> selectListView(@Param("ew") Wrapper<DangyuanbiandongEntity> wrapper);

	List<DangyuanbiandongView> selectListView(Pagination page,@Param("ew") Wrapper<DangyuanbiandongEntity> wrapper);
	
	DangyuanbiandongView selectView(@Param("ew") Wrapper<DangyuanbiandongEntity> wrapper);
	
}
