package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouruxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouruxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouruxinxiView;


/**
 * 收入信息
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface ShouruxinxiService extends IService<ShouruxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouruxinxiVO> selectListVO(Wrapper<ShouruxinxiEntity> wrapper);
   	
   	ShouruxinxiVO selectVO(@Param("ew") Wrapper<ShouruxinxiEntity> wrapper);
   	
   	List<ShouruxinxiView> selectListView(Wrapper<ShouruxinxiEntity> wrapper);
   	
   	ShouruxinxiView selectView(@Param("ew") Wrapper<ShouruxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouruxinxiEntity> wrapper);
   	
}

