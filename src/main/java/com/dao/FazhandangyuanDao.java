package com.dao;

import com.entity.FazhandangyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FazhandangyuanVO;
import com.entity.view.FazhandangyuanView;


/**
 * 发展党员
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
public interface FazhandangyuanDao extends BaseMapper<FazhandangyuanEntity> {
	
	List<FazhandangyuanVO> selectListVO(@Param("ew") Wrapper<FazhandangyuanEntity> wrapper);
	
	FazhandangyuanVO selectVO(@Param("ew") Wrapper<FazhandangyuanEntity> wrapper);
	
	List<FazhandangyuanView> selectListView(@Param("ew") Wrapper<FazhandangyuanEntity> wrapper);

	List<FazhandangyuanView> selectListView(Pagination page,@Param("ew") Wrapper<FazhandangyuanEntity> wrapper);
	
	FazhandangyuanView selectView(@Param("ew") Wrapper<FazhandangyuanEntity> wrapper);
	
}
