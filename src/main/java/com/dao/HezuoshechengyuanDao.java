package com.dao;

import com.entity.HezuoshechengyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HezuoshechengyuanVO;
import com.entity.view.HezuoshechengyuanView;


/**
 * 合作社成员
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface HezuoshechengyuanDao extends BaseMapper<HezuoshechengyuanEntity> {
	
	List<HezuoshechengyuanVO> selectListVO(@Param("ew") Wrapper<HezuoshechengyuanEntity> wrapper);
	
	HezuoshechengyuanVO selectVO(@Param("ew") Wrapper<HezuoshechengyuanEntity> wrapper);
	
	List<HezuoshechengyuanView> selectListView(@Param("ew") Wrapper<HezuoshechengyuanEntity> wrapper);

	List<HezuoshechengyuanView> selectListView(Pagination page,@Param("ew") Wrapper<HezuoshechengyuanEntity> wrapper);
	
	HezuoshechengyuanView selectView(@Param("ew") Wrapper<HezuoshechengyuanEntity> wrapper);
	
}
