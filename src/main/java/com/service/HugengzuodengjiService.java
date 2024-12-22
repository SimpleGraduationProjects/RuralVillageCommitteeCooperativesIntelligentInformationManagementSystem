package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HugengzuodengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HugengzuodengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HugengzuodengjiView;


/**
 * 户耕作登记
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:34
 */
public interface HugengzuodengjiService extends IService<HugengzuodengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HugengzuodengjiVO> selectListVO(Wrapper<HugengzuodengjiEntity> wrapper);
   	
   	HugengzuodengjiVO selectVO(@Param("ew") Wrapper<HugengzuodengjiEntity> wrapper);
   	
   	List<HugengzuodengjiView> selectListView(Wrapper<HugengzuodengjiEntity> wrapper);
   	
   	HugengzuodengjiView selectView(@Param("ew") Wrapper<HugengzuodengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HugengzuodengjiEntity> wrapper);
   	
}

