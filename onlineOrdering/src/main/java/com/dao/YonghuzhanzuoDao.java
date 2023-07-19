package com.dao;

import com.entity.YonghuzhanzuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuzhanzuoVO;
import com.entity.view.YonghuzhanzuoView;


/**
 * 用户占座
 * 
 * @author 
 * @email 
 * @date 2022-03-23 09:44:31
 */
public interface YonghuzhanzuoDao extends BaseMapper<YonghuzhanzuoEntity> {
	
	List<YonghuzhanzuoVO> selectListVO(@Param("ew") Wrapper<YonghuzhanzuoEntity> wrapper);
	
	YonghuzhanzuoVO selectVO(@Param("ew") Wrapper<YonghuzhanzuoEntity> wrapper);
	
	List<YonghuzhanzuoView> selectListView(@Param("ew") Wrapper<YonghuzhanzuoEntity> wrapper);

	List<YonghuzhanzuoView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuzhanzuoEntity> wrapper);
	
	YonghuzhanzuoView selectView(@Param("ew") Wrapper<YonghuzhanzuoEntity> wrapper);
	

}
