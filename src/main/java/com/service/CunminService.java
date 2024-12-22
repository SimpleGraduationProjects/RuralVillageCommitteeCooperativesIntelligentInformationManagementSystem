package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CunminEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CunminVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CunminView;


/**
 * 村民
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
public interface CunminService extends IService<CunminEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CunminVO> selectListVO(Wrapper<CunminEntity> wrapper);
   	
   	CunminVO selectVO(@Param("ew") Wrapper<CunminEntity> wrapper);
   	
   	List<CunminView> selectListView(Wrapper<CunminEntity> wrapper);
   	
   	CunminView selectView(@Param("ew") Wrapper<CunminEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CunminEntity> wrapper);
   	
}

