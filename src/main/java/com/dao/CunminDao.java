package com.dao;

import com.entity.CunminEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CunminVO;
import com.entity.view.CunminView;


/**
 * 村民
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
public interface CunminDao extends BaseMapper<CunminEntity> {
	
	List<CunminVO> selectListVO(@Param("ew") Wrapper<CunminEntity> wrapper);
	
	CunminVO selectVO(@Param("ew") Wrapper<CunminEntity> wrapper);
	
	List<CunminView> selectListView(@Param("ew") Wrapper<CunminEntity> wrapper);

	List<CunminView> selectListView(Pagination page,@Param("ew") Wrapper<CunminEntity> wrapper);
	
	CunminView selectView(@Param("ew") Wrapper<CunminEntity> wrapper);
	
}
