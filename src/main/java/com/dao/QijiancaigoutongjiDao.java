package com.dao;

import com.entity.QijiancaigoutongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QijiancaigoutongjiVO;
import com.entity.view.QijiancaigoutongjiView;


/**
 * 期间采购统计
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface QijiancaigoutongjiDao extends BaseMapper<QijiancaigoutongjiEntity> {
	
	List<QijiancaigoutongjiVO> selectListVO(@Param("ew") Wrapper<QijiancaigoutongjiEntity> wrapper);
	
	QijiancaigoutongjiVO selectVO(@Param("ew") Wrapper<QijiancaigoutongjiEntity> wrapper);
	
	List<QijiancaigoutongjiView> selectListView(@Param("ew") Wrapper<QijiancaigoutongjiEntity> wrapper);

	List<QijiancaigoutongjiView> selectListView(Pagination page,@Param("ew") Wrapper<QijiancaigoutongjiEntity> wrapper);
	
	QijiancaigoutongjiView selectView(@Param("ew") Wrapper<QijiancaigoutongjiEntity> wrapper);
	
}
