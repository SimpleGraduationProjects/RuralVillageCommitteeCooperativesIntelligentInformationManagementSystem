package com.dao;

import com.entity.CunweihuichengyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CunweihuichengyuanVO;
import com.entity.view.CunweihuichengyuanView;


/**
 * 村委会成员
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
public interface CunweihuichengyuanDao extends BaseMapper<CunweihuichengyuanEntity> {
	
	List<CunweihuichengyuanVO> selectListVO(@Param("ew") Wrapper<CunweihuichengyuanEntity> wrapper);
	
	CunweihuichengyuanVO selectVO(@Param("ew") Wrapper<CunweihuichengyuanEntity> wrapper);
	
	List<CunweihuichengyuanView> selectListView(@Param("ew") Wrapper<CunweihuichengyuanEntity> wrapper);

	List<CunweihuichengyuanView> selectListView(Pagination page,@Param("ew") Wrapper<CunweihuichengyuanEntity> wrapper);
	
	CunweihuichengyuanView selectView(@Param("ew") Wrapper<CunweihuichengyuanEntity> wrapper);
	
}
