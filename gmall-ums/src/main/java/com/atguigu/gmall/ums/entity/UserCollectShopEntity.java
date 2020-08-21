package com.atguigu.gmall.ums.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 关注店铺表
 * 
 * @author fjy
 * @email 1159213392@qq.com
 * @date 2020-08-21 12:51:49
 */
@Data
@TableName("ums_user_collect_shop")
public class UserCollectShopEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 店铺id
	 */
	private Long shopId;
	/**
	 * 店铺名
	 */
	private String shopName;
	/**
	 * 店铺logo
	 */
	private String shopLogo;
	/**
	 * 关注时间
	 */
	private Date createtime;

}