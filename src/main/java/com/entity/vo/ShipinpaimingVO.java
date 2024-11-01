package com.entity.vo;

import com.entity.ShipinpaimingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 视频排名
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-30 20:41:18
 */
public class ShipinpaimingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
