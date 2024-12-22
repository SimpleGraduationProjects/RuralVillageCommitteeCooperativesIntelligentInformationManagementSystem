package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YushouchengjiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YushouchengjiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YushouchengjiaoView;


/**
 * 预售成交
 *
 * @author 
 * @email 
 * @date 2021-04-20 12:05:35
 */
public interface YushouchengjiaoService extends IService<YushouchengjiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YushouchengjiaoVO> selectListVO(Wrapper<YushouchengjiaoEntity> wrapper);
   	
   	YushouchengjiaoVO selectVO(@Param("ew") Wrapper<YushouchengjiaoEntity> wrapper);
   	
   	List<YushouchengjiaoView> selectListView(Wrapper<YushouchengjiaoEntity> wrapper);
   	
   	YushouchengjiaoView selectView(@Param("ew") Wrapper<YushouchengjiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YushouchengjiaoEntity> wrapper);
   	
}

