package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiwuView;


/**
 * 事务
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
public interface ShiwuService extends IService<ShiwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiwuVO> selectListVO(Wrapper<ShiwuEntity> wrapper);
   	
   	ShiwuVO selectVO(@Param("ew") Wrapper<ShiwuEntity> wrapper);
   	
   	List<ShiwuView> selectListView(Wrapper<ShiwuEntity> wrapper);
   	
   	ShiwuView selectView(@Param("ew") Wrapper<ShiwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiwuEntity> wrapper);
   	
}

