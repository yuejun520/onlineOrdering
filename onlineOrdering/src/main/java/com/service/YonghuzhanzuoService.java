package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuzhanzuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuzhanzuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuzhanzuoView;


/**
 * 用户占座
 *
 * @author 
 * @email 
 * @date 2022-03-23 09:44:31
 */
public interface YonghuzhanzuoService extends IService<YonghuzhanzuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuzhanzuoVO> selectListVO(Wrapper<YonghuzhanzuoEntity> wrapper);
   	
   	YonghuzhanzuoVO selectVO(@Param("ew") Wrapper<YonghuzhanzuoEntity> wrapper);
   	
   	List<YonghuzhanzuoView> selectListView(Wrapper<YonghuzhanzuoEntity> wrapper);
   	
   	YonghuzhanzuoView selectView(@Param("ew") Wrapper<YonghuzhanzuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuzhanzuoEntity> wrapper);
   	

}

