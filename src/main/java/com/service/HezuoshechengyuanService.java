package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HezuoshechengyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HezuoshechengyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HezuoshechengyuanView;


/**
 * 合作社成员
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface HezuoshechengyuanService extends IService<HezuoshechengyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HezuoshechengyuanVO> selectListVO(Wrapper<HezuoshechengyuanEntity> wrapper);
   	
   	HezuoshechengyuanVO selectVO(@Param("ew") Wrapper<HezuoshechengyuanEntity> wrapper);
   	
   	List<HezuoshechengyuanView> selectListView(Wrapper<HezuoshechengyuanEntity> wrapper);
   	
   	HezuoshechengyuanView selectView(@Param("ew") Wrapper<HezuoshechengyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HezuoshechengyuanEntity> wrapper);
   	
}

