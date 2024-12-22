package com.dao;

import com.entity.HugengzuodengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HugengzuodengjiVO;
import com.entity.view.HugengzuodengjiView;


/**
 * 户耕作登记
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
public interface HugengzuodengjiDao extends BaseMapper<HugengzuodengjiEntity> {
	
	List<HugengzuodengjiVO> selectListVO(@Param("ew") Wrapper<HugengzuodengjiEntity> wrapper);
	
	HugengzuodengjiVO selectVO(@Param("ew") Wrapper<HugengzuodengjiEntity> wrapper);
	
	List<HugengzuodengjiView> selectListView(@Param("ew") Wrapper<HugengzuodengjiEntity> wrapper);

	List<HugengzuodengjiView> selectListView(Pagination page,@Param("ew") Wrapper<HugengzuodengjiEntity> wrapper);
	
	HugengzuodengjiView selectView(@Param("ew") Wrapper<HugengzuodengjiEntity> wrapper);
	
}
