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
 * 卖家
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-21 16:46:56
 */
@TableName("maijia")
public class MaijiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MaijiaEntity() {
		
	}
	
	public MaijiaEntity(T t) {
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
	 * 卖家账号
	 */
					
	private String maijiazhanghao;
	
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
	 * 设置：卖家账号
	 */
	public void setMaijiazhanghao(String maijiazhanghao) {
		this.maijiazhanghao = maijiazhanghao;
	}
	/**
	 * 获取：卖家账号
	 */
	public String getMaijiazhanghao() {
		return maijiazhanghao;
	}
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
