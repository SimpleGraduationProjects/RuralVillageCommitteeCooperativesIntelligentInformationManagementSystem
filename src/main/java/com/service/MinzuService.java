package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MinzuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MinzuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MinzuView;


/**
 * 民族
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface MinzuService extends IService<MinzuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MinzuVO> selectListVO(Wrapper<MinzuEntity> wrapper);
   	
   	MinzuVO selectVO(@Param("ew") Wrapper<MinzuEntity> wrapper);
   	
   	List<MinzuView> selectListView(Wrapper<MinzuEntity> wrapper);
   	
   	MinzuView selectView(@Param("ew") Wrapper<MinzuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MinzuEntity> wrapper);
   	
}

