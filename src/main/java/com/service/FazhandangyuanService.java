package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FazhandangyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FazhandangyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FazhandangyuanView;


/**
 * 发展党员
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
public interface FazhandangyuanService extends IService<FazhandangyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FazhandangyuanVO> selectListVO(Wrapper<FazhandangyuanEntity> wrapper);
   	
   	FazhandangyuanVO selectVO(@Param("ew") Wrapper<FazhandangyuanEntity> wrapper);
   	
   	List<FazhandangyuanView> selectListView(Wrapper<FazhandangyuanEntity> wrapper);
   	
   	FazhandangyuanView selectView(@Param("ew") Wrapper<FazhandangyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FazhandangyuanEntity> wrapper);
   	
}

