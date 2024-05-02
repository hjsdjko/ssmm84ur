package com.entity.vo;

import com.entity.MaijiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 卖家
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-21 16:46:56
 */
public class MaijiaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 卖家姓名
	 */
	
	private String maijiaxingming;
		
	/**
	 * 卖家学校
	 */
	
	private String maijiaxuexiao;
		
	/**
	 * 卖家性别
	 */
	
	private String maijiaxingbie;
		
	/**
	 * 卖家手机
	 */
	
	private String maijiashouji;
		
	/**
	 * 卖家QQ
	 */
	
	private Integer maijiaqq;
		
	/**
	 * 卖家微信
	 */
	
	private Integer maijiaweixin;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：卖家姓名
	 */
	 
	public void setMaijiaxingming(String maijiaxingming) {
		this.maijiaxingming = maijiaxingming;
	}
	
	/**
	 * 获取：卖家姓名
	 */
	public String getMaijiaxingming() {
		return maijiaxingming;
	}
				
	
	/**
	 * 设置：卖家学校
	 */
	 
	public void setMaijiaxuexiao(String maijiaxuexiao) {
		this.maijiaxuexiao = maijiaxuexiao;
	}
	
	/**
	 * 获取：卖家学校
	 */
	public String getMaijiaxuexiao() {
		return maijiaxuexiao;
	}
				
	
	/**
	 * 设置：卖家性别
	 */
	 
	public void setMaijiaxingbie(String maijiaxingbie) {
		this.maijiaxingbie = maijiaxingbie;
	}
	
	/**
	 * 获取：卖家性别
	 */
	public String getMaijiaxingbie() {
		return maijiaxingbie;
	}
				
	
	/**
	 * 设置：卖家手机
	 */
	 
	public void setMaijiashouji(String maijiashouji) {
		this.maijiashouji = maijiashouji;
	}
	
	/**
	 * 获取：卖家手机
	 */
	public String getMaijiashouji() {
		return maijiashouji;
	}
				
	
	/**
	 * 设置：卖家QQ
	 */
	 
	public void setMaijiaqq(Integer maijiaqq) {
		this.maijiaqq = maijiaqq;
	}
	
	/**
	 * 获取：卖家QQ
	 */
	public Integer getMaijiaqq() {
		return maijiaqq;
	}
				
	
	/**
	 * 设置：卖家微信
	 */
	 
	public void setMaijiaweixin(Integer maijiaweixin) {
		this.maijiaweixin = maijiaweixin;
	}
	
	/**
	 * 获取：卖家微信
	 */
	public Integer getMaijiaweixin() {
		return maijiaweixin;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
			
}
