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
 * 视频排名
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-30 20:41:18
 */
@TableName("shipinpaiming")
public class ShipinpaimingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShipinpaimingEntity() {
		
	}
	
	public ShipinpaimingEntity(T t) {
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
	 * 视频名称
	 */
					
	private String shipinmingcheng;
	
	/**
	 * 类型
	 */
					
	private String leixing;
	
	/**
	 * 视频简介
	 */
					
	private String shipinjianjie;
	
	/**
	 * 播放量
	 */
					
	private Integer bofangliang;
	
	/**
	 * 播放时长
	 */
					
	private String bofangshizhang;
	
	/**
	 * 在线视频
	 */
					
	private String zaixianshipin;
	
	/**
	 * 发布者
	 */
					
	private String fabuzhe;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
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
	 * 设置：视频名称
	 */
	public void setShipinmingcheng(String shipinmingcheng) {
		this.shipinmingcheng = shipinmingcheng;
	}
	/**
	 * 获取：视频名称
	 */
	public String getShipinmingcheng() {
		return shipinmingcheng;
	}
	/**
	 * 设置：类型
	 */
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
	/**
	 * 设置：视频简介
	 */
	public void setShipinjianjie(String shipinjianjie) {
		this.shipinjianjie = shipinjianjie;
	}
	/**
	 * 获取：视频简介
	 */
	public String getShipinjianjie() {
		return shipinjianjie;
	}
	/**
	 * 设置：播放量
	 */
	public void setBofangliang(Integer bofangliang) {
		this.bofangliang = bofangliang;
	}
	/**
	 * 获取：播放量
	 */
	public Integer getBofangliang() {
		return bofangliang;
	}
	/**
	 * 设置：播放时长
	 */
	public void setBofangshizhang(String bofangshizhang) {
		this.bofangshizhang = bofangshizhang;
	}
	/**
	 * 获取：播放时长
	 */
	public String getBofangshizhang() {
		return bofangshizhang;
	}
	/**
	 * 设置：在线视频
	 */
	public void setZaixianshipin(String zaixianshipin) {
		this.zaixianshipin = zaixianshipin;
	}
	/**
	 * 获取：在线视频
	 */
	public String getZaixianshipin() {
		return zaixianshipin;
	}
	/**
	 * 设置：发布者
	 */
	public void setFabuzhe(String fabuzhe) {
		this.fabuzhe = fabuzhe;
	}
	/**
	 * 获取：发布者
	 */
	public String getFabuzhe() {
		return fabuzhe;
	}
	/**
	 * 设置：发布日期
	 */
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}

}
