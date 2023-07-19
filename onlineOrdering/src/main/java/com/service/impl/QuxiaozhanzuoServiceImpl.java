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


import com.dao.QuxiaozhanzuoDao;
import com.entity.QuxiaozhanzuoEntity;
import com.service.QuxiaozhanzuoService;
import com.entity.vo.QuxiaozhanzuoVO;
import com.entity.view.QuxiaozhanzuoView;

@Service("quxiaozhanzuoService")
public class QuxiaozhanzuoServiceImpl extends ServiceImpl<QuxiaozhanzuoDao, QuxiaozhanzuoEntity> implements QuxiaozhanzuoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuxiaozhanzuoEntity> page = this.selectPage(
                new Query<QuxiaozhanzuoEntity>(params).getPage(),
                new EntityWrapper<QuxiaozhanzuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuxiaozhanzuoEntity> wrapper) {
		  Page<QuxiaozhanzuoView> page =new Query<QuxiaozhanzuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuxiaozhanzuoVO> selectListVO(Wrapper<QuxiaozhanzuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuxiaozhanzuoVO selectVO(Wrapper<QuxiaozhanzuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuxiaozhanzuoView> selectListView(Wrapper<QuxiaozhanzuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuxiaozhanzuoView selectView(Wrapper<QuxiaozhanzuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
