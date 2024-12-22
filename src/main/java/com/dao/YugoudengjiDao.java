package com.dao;

import com.entity.YugoudengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YugoudengjiVO;
import com.entity.view.YugoudengjiView;


/**
 * 预购登记
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface YugoudengjiDao extends BaseMapper<YugoudengjiEntity> {
	
	List<YugoudengjiVO> selectListVO(@Param("ew") Wrapper<YugoudengjiEntity> wrapper);
	
	YugoudengjiVO selectVO(@Param("ew") Wrapper<YugoudengjiEntity> wrapper);
	
	List<YugoudengjiView> selectListView(@Param("ew") Wrapper<YugoudengjiEntity> wrapper);

	List<YugoudengjiView> selectListView(Pagination page,@Param("ew") Wrapper<YugoudengjiEntity> wrapper);
	
	YugoudengjiView selectView(@Param("ew") Wrapper<YugoudengjiEntity> wrapper);
	
}
