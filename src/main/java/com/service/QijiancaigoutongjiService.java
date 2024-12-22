package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QijiancaigoutongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QijiancaigoutongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QijiancaigoutongjiView;


/**
 * 期间采购统计
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface QijiancaigoutongjiService extends IService<QijiancaigoutongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QijiancaigoutongjiVO> selectListVO(Wrapper<QijiancaigoutongjiEntity> wrapper);
   	
   	QijiancaigoutongjiVO selectVO(@Param("ew") Wrapper<QijiancaigoutongjiEntity> wrapper);
   	
   	List<QijiancaigoutongjiView> selectListView(Wrapper<QijiancaigoutongjiEntity> wrapper);
   	
   	QijiancaigoutongjiView selectView(@Param("ew") Wrapper<QijiancaigoutongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QijiancaigoutongjiEntity> wrapper);
   	
}

