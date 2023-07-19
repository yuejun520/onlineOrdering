package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 餐桌信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-23 09:44:31
 */
@TableName("canzhuoxinxi")
public class CanzhuoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CanzhuoxinxiEntity() {
		
	}
	
	public CanzhuoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 餐桌编号
	 */
					
	private String canzhuobianhao;
	
	/**
	 * 位置
	 */
					
	private String weizhi;
	
	/**
	 * 可坐人数
	 */
					
	private Integer kezuorenshu;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
	/**
	 * 颜色
	 */
					
	private String yanse;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 实时时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shishishijian;
	
	/**
	 * 详细介绍
	 */
					
	private String xiangxijieshao;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：餐桌编号
	 */
	public void setCanzhuobianhao(String canzhuobianhao) {
		this.canzhuobianhao = canzhuobianhao;
	}
	/**
	 * 获取：餐桌编号
	 */
	public String getCanzhuobianhao() {
		return canzhuobianhao;
	}
	/**
	 * 设置：位置
	 */
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
	/**
	 * 设置：可坐人数
	 */
	public void setKezuorenshu(Integer kezuorenshu) {
		this.kezuorenshu = kezuorenshu;
	}
	/**
	 * 获取：可坐人数
	 */
	public Integer getKezuorenshu() {
		return kezuorenshu;
	}
	/**
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
	/**
	 * 设置：颜色
	 */
	public void setYanse(String yanse) {
		this.yanse = yanse;
	}
	/**
	 * 获取：颜色
	 */
	public String getYanse() {
		return yanse;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：实时时间
	 */
	public void setShishishijian(Date shishishijian) {
		this.shishishijian = shishishijian;
	}
	/**
	 * 获取：实时时间
	 */
	public Date getShishishijian() {
		return shishishijian;
	}
	/**
	 * 设置：详细介绍
	 */
	public void setXiangxijieshao(String xiangxijieshao) {
		this.xiangxijieshao = xiangxijieshao;
	}
	/**
	 * 获取：详细介绍
	 */
	public String getXiangxijieshao() {
		return xiangxijieshao;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
