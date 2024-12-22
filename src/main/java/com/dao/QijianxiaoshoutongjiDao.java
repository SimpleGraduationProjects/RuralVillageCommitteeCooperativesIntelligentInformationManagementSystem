package com.dao;

import com.entity.QijianxiaoshoutongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QijianxiaoshoutongjiVO;
import com.entity.view.QijianxiaoshoutongjiView;


/**
 * 期间销售统计
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface QijianxiaoshoutongjiDao extends BaseMapper<QijianxiaoshoutongjiEntity> {
	
	List<QijianxiaoshoutongjiVO> selectListVO(@Param("ew") Wrapper<QijianxiaoshoutongjiEntity> wrapper);
	
	QijianxiaoshoutongjiVO selectVO(@Param("ew") Wrapper<QijianxiaoshoutongjiEntity> wrapper);
	
	List<QijianxiaoshoutongjiView> selectListView(@Param("ew") Wrapper<QijianxiaoshoutongjiEntity> wrapper);

	List<QijianxiaoshoutongjiView> selectListView(Pagination page,@Param("ew") Wrapper<QijianxiaoshoutongjiEntity> wrapper);
	
	QijianxiaoshoutongjiView selectView(@Param("ew") Wrapper<QijianxiaoshoutongjiEntity> wrapper);
	
}
