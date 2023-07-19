package com.entity.view;

import com.entity.YonghuzhanzuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户占座
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-23 09:44:31
 */
@TableName("yonghuzhanzuo")
public class YonghuzhanzuoView  extends YonghuzhanzuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghuzhanzuoView(){
	}
 
 	public YonghuzhanzuoView(YonghuzhanzuoEntity yonghuzhanzuoEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuzhanzuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
