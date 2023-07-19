package com.dao;

import com.entity.QuxiaozhanzuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuxiaozhanzuoVO;
import com.entity.view.QuxiaozhanzuoView;


/**
 * 取消占座
 * 
 * @author 
 * @email 
 * @date 2022-03-23 09:44:31
 */
public interface QuxiaozhanzuoDao extends BaseMapper<QuxiaozhanzuoEntity> {
	
	List<QuxiaozhanzuoVO> selectListVO(@Param("ew") Wrapper<QuxiaozhanzuoEntity> wrapper);
	
	QuxiaozhanzuoVO selectVO(@Param("ew") Wrapper<QuxiaozhanzuoEntity> wrapper);
	
	List<QuxiaozhanzuoView> selectListView(@Param("ew") Wrapper<QuxiaozhanzuoEntity> wrapper);

	List<QuxiaozhanzuoView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaozhanzuoEntity> wrapper);
	
	QuxiaozhanzuoView selectView(@Param("ew") Wrapper<QuxiaozhanzuoEntity> wrapper);
	

}
