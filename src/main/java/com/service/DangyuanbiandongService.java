package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangyuanbiandongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangyuanbiandongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangyuanbiandongView;


/**
 * 党员变动
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface DangyuanbiandongService extends IService<DangyuanbiandongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangyuanbiandongVO> selectListVO(Wrapper<DangyuanbiandongEntity> wrapper);
   	
   	DangyuanbiandongVO selectVO(@Param("ew") Wrapper<DangyuanbiandongEntity> wrapper);
   	
   	List<DangyuanbiandongView> selectListView(Wrapper<DangyuanbiandongEntity> wrapper);
   	
   	DangyuanbiandongView selectView(@Param("ew") Wrapper<DangyuanbiandongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangyuanbiandongEntity> wrapper);
   	
}

