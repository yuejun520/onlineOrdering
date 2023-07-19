package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuxiaozhanzuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuxiaozhanzuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuxiaozhanzuoView;


/**
 * 取消占座
 *
 * @author 
 * @email 
 * @date 2022-03-23 09:44:31
 */
public interface QuxiaozhanzuoService extends IService<QuxiaozhanzuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaozhanzuoVO> selectListVO(Wrapper<QuxiaozhanzuoEntity> wrapper);
   	
   	QuxiaozhanzuoVO selectVO(@Param("ew") Wrapper<QuxiaozhanzuoEntity> wrapper);
   	
   	List<QuxiaozhanzuoView> selectListView(Wrapper<QuxiaozhanzuoEntity> wrapper);
   	
   	QuxiaozhanzuoView selectView(@Param("ew") Wrapper<QuxiaozhanzuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuxiaozhanzuoEntity> wrapper);
   	

}

