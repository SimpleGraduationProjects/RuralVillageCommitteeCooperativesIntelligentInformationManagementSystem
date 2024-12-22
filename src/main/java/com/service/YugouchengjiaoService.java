package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YugouchengjiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YugouchengjiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YugouchengjiaoView;


/**
 * 预购成交
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface YugouchengjiaoService extends IService<YugouchengjiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YugouchengjiaoVO> selectListVO(Wrapper<YugouchengjiaoEntity> wrapper);
   	
   	YugouchengjiaoVO selectVO(@Param("ew") Wrapper<YugouchengjiaoEntity> wrapper);
   	
   	List<YugouchengjiaoView> selectListView(Wrapper<YugouchengjiaoEntity> wrapper);
   	
   	YugouchengjiaoView selectView(@Param("ew") Wrapper<YugouchengjiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YugouchengjiaoEntity> wrapper);
   	
}

