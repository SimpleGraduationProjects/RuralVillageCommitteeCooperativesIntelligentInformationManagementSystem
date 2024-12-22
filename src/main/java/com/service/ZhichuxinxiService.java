package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhichuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhichuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhichuxinxiView;


/**
 * 支出信息
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface ZhichuxinxiService extends IService<ZhichuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhichuxinxiVO> selectListVO(Wrapper<ZhichuxinxiEntity> wrapper);
   	
   	ZhichuxinxiVO selectVO(@Param("ew") Wrapper<ZhichuxinxiEntity> wrapper);
   	
   	List<ZhichuxinxiView> selectListView(Wrapper<ZhichuxinxiEntity> wrapper);
   	
   	ZhichuxinxiView selectView(@Param("ew") Wrapper<ZhichuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhichuxinxiEntity> wrapper);
   	
}

