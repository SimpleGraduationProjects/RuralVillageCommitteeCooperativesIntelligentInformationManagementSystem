package com.dao;

import com.entity.YushoudengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YushoudengjiVO;
import com.entity.view.YushoudengjiView;


/**
 * 预售登记
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface YushoudengjiDao extends BaseMapper<YushoudengjiEntity> {
	
	List<YushoudengjiVO> selectListVO(@Param("ew") Wrapper<YushoudengjiEntity> wrapper);
	
	YushoudengjiVO selectVO(@Param("ew") Wrapper<YushoudengjiEntity> wrapper);
	
	List<YushoudengjiView> selectListView(@Param("ew") Wrapper<YushoudengjiEntity> wrapper);

	List<YushoudengjiView> selectListView(Pagination page,@Param("ew") Wrapper<YushoudengjiEntity> wrapper);
	
	YushoudengjiView selectView(@Param("ew") Wrapper<YushoudengjiEntity> wrapper);
	
}
