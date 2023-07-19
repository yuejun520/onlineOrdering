package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YonghuzhanzuoDao;
import com.entity.YonghuzhanzuoEntity;
import com.service.YonghuzhanzuoService;
import com.entity.vo.YonghuzhanzuoVO;
import com.entity.view.YonghuzhanzuoView;

@Service("yonghuzhanzuoService")
public class YonghuzhanzuoServiceImpl extends ServiceImpl<YonghuzhanzuoDao, YonghuzhanzuoEntity> implements YonghuzhanzuoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuzhanzuoEntity> page = this.selectPage(
                new Query<YonghuzhanzuoEntity>(params).getPage(),
                new EntityWrapper<YonghuzhanzuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuzhanzuoEntity> wrapper) {
		  Page<YonghuzhanzuoView> page =new Query<YonghuzhanzuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuzhanzuoVO> selectListVO(Wrapper<YonghuzhanzuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuzhanzuoVO selectVO(Wrapper<YonghuzhanzuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuzhanzuoView> selectListView(Wrapper<YonghuzhanzuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuzhanzuoView selectView(Wrapper<YonghuzhanzuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
