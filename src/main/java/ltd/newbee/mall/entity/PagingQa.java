/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本系统已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2020 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PagingQa {
	private Long goodsId;
	
    private String orderBy;

    private String configName;

    private Integer configRank;

    private Byte cofigType;

    private Long page;

    private Date submitDate;
    
    private String helpedNum;

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public Integer getConfigRank() {
		return configRank;
	}

	public void setConfigRank(Integer configRank) {
		this.configRank = configRank;
	}

	public Byte getCofigType() {
		return cofigType;
	}

	public void setCofigType(Byte cofigType) {
		this.cofigType = cofigType;
	}

	public Long getPage() {
		return page;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public String getHelpedNum() {
		return helpedNum;
	}

	public void setHelpedNum(String helpedNum) {
		this.helpedNum = helpedNum;
	}

	@Override
	public String toString() {
		return "PagingQa [goodsId=" + goodsId + ", orderBy=" + orderBy + ", configName=" + configName + ", configRank="
				+ configRank + ", cofigType=" + cofigType + ", page=" + page + ", submitDate=" + submitDate
				+ ", helpedNum=" + helpedNum + "]";
	}

}