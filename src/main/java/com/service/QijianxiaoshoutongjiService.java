package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QijianxiaoshoutongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QijianxiaoshoutongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QijianxiaoshoutongjiView;


/**
 * 期间销售统计
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface QijianxiaoshoutongjiService extends IService<QijianxiaoshoutongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QijianxiaoshoutongjiVO> selectListVO(Wrapper<QijianxiaoshoutongjiEntity> wrapper);
   	
   	QijianxiaoshoutongjiVO selectVO(@Param("ew") Wrapper<QijianxiaoshoutongjiEntity> wrapper);
   	
   	List<QijianxiaoshoutongjiView> selectListView(Wrapper<QijianxiaoshoutongjiEntity> wrapper);
   	
   	QijianxiaoshoutongjiView selectView(@Param("ew") Wrapper<QijianxiaoshoutongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QijianxiaoshoutongjiEntity> wrapper);
   	
}

