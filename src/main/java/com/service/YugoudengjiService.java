package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YugoudengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YugoudengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YugoudengjiView;


/**
 * 预购登记
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface YugoudengjiService extends IService<YugoudengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YugoudengjiVO> selectListVO(Wrapper<YugoudengjiEntity> wrapper);
   	
   	YugoudengjiVO selectVO(@Param("ew") Wrapper<YugoudengjiEntity> wrapper);
   	
   	List<YugoudengjiView> selectListView(Wrapper<YugoudengjiEntity> wrapper);
   	
   	YugoudengjiView selectView(@Param("ew") Wrapper<YugoudengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YugoudengjiEntity> wrapper);
   	
}

