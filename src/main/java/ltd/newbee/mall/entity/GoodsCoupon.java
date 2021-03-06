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

public class GoodsCoupon {
    private Long couponId;
    private String couponName;
    private String flag;
    private Date startDate;
    private Date end_date;
    public Long getCouponId() {
        return couponId;
    }
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }
    public String getCouponName() {
        return couponName;
    }
    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }
    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEnd_date() {
        return end_date;
    }
    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
    @Override
    public String toString() {
	return "GoodsCoupon [couponId=" + couponId + ", couponName=" + couponName + ", flag=" + flag + ", startDate="
		+ startDate + ", end_date=" + end_date + "]";
    }
    
  
}