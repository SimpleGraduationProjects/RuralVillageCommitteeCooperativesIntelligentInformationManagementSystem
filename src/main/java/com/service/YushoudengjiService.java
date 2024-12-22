package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YushoudengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YushoudengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YushoudengjiView;


/**
 * 预售登记
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface YushoudengjiService extends IService<YushoudengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YushoudengjiVO> selectListVO(Wrapper<YushoudengjiEntity> wrapper);
   	
   	YushoudengjiVO selectVO(@Param("ew") Wrapper<YushoudengjiEntity> wrapper);
   	
   	List<YushoudengjiView> selectListView(Wrapper<YushoudengjiEntity> wrapper);
   	
   	YushoudengjiView selectView(@Param("ew") Wrapper<YushoudengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YushoudengjiEntity> wrapper);
   	
}

