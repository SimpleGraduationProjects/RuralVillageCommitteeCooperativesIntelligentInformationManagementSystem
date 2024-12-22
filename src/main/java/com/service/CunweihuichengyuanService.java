package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CunweihuichengyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CunweihuichengyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CunweihuichengyuanView;


/**
 * 村委会成员
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
public interface CunweihuichengyuanService extends IService<CunweihuichengyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CunweihuichengyuanVO> selectListVO(Wrapper<CunweihuichengyuanEntity> wrapper);
   	
   	CunweihuichengyuanVO selectVO(@Param("ew") Wrapper<CunweihuichengyuanEntity> wrapper);
   	
   	List<CunweihuichengyuanView> selectListView(Wrapper<CunweihuichengyuanEntity> wrapper);
   	
   	CunweihuichengyuanView selectView(@Param("ew") Wrapper<CunweihuichengyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CunweihuichengyuanEntity> wrapper);
   	
}

