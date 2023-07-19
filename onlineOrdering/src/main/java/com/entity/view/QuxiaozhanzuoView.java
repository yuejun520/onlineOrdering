package com.entity.view;

import com.entity.QuxiaozhanzuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 取消占座
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-23 09:44:31
 */
@TableName("quxiaozhanzuo")
public class QuxiaozhanzuoView  extends QuxiaozhanzuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuxiaozhanzuoView(){
	}
 
 	public QuxiaozhanzuoView(QuxiaozhanzuoEntity quxiaozhanzuoEntity){
 	try {
			BeanUtils.copyProperties(this, quxiaozhanzuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
