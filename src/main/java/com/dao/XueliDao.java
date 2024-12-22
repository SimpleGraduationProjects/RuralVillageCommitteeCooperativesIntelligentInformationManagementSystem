package com.dao;

import com.entity.XueliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueliVO;
import com.entity.view.XueliView;


/**
 * 学历
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface XueliDao extends BaseMapper<XueliEntity> {
	
	List<XueliVO> selectListVO(@Param("ew") Wrapper<XueliEntity> wrapper);
	
	XueliVO selectVO(@Param("ew") Wrapper<XueliEntity> wrapper);
	
	List<XueliView> selectListView(@Param("ew") Wrapper<XueliEntity> wrapper);

	List<XueliView> selectListView(Pagination page,@Param("ew") Wrapper<XueliEntity> wrapper);
	
	XueliView selectView(@Param("ew") Wrapper<XueliEntity> wrapper);
	
}
