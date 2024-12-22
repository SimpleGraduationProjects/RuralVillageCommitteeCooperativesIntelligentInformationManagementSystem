package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueliView;


/**
 * 学历
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface XueliService extends IService<XueliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueliVO> selectListVO(Wrapper<XueliEntity> wrapper);
   	
   	XueliVO selectVO(@Param("ew") Wrapper<XueliEntity> wrapper);
   	
   	List<XueliView> selectListView(Wrapper<XueliEntity> wrapper);
   	
   	XueliView selectView(@Param("ew") Wrapper<XueliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueliEntity> wrapper);
   	
}

