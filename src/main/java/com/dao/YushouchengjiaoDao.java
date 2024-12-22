package com.dao;

import com.entity.YushouchengjiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YushouchengjiaoVO;
import com.entity.view.YushouchengjiaoView;


/**
 * 预售成交
 * 
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface YushouchengjiaoDao extends BaseMapper<YushouchengjiaoEntity> {
	
	List<YushouchengjiaoVO> selectListVO(@Param("ew") Wrapper<YushouchengjiaoEntity> wrapper);
	
	YushouchengjiaoVO selectVO(@Param("ew") Wrapper<YushouchengjiaoEntity> wrapper);
	
	List<YushouchengjiaoView> selectListView(@Param("ew") Wrapper<YushouchengjiaoEntity> wrapper);

	List<YushouchengjiaoView> selectListView(Pagination page,@Param("ew") Wrapper<YushouchengjiaoEntity> wrapper);
	
	YushouchengjiaoView selectView(@Param("ew") Wrapper<YushouchengjiaoEntity> wrapper);
	
}
