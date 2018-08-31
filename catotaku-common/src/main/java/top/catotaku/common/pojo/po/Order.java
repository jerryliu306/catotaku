package top.catotaku.common.pojo.po;

import java.util.Date;

public class Order {
    private Integer id;

    private Date makedate;

    private Date paymentdate;

    private Date dekuverdate;

    private Date enddate;

    private Integer logisticsnumber;

    private Integer status;

    private Double discounts;

    private Double shopvolume;

    private Double fireight;

    private Integer uId;

    private Integer uaId;

    private Integer xxId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMakedate() {
        return makedate;
    }

    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }

    public Date getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Date paymentdate) {
        this.paymentdate = paymentdate;
    }

    public Date getDekuverdate() {
        return dekuverdate;
    }

    public void setDekuverdate(Date dekuverdate) {
        this.dekuverdate = dekuverdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getLogisticsnumber() {
        return logisticsnumber;
    }

    public void setLogisticsnumber(Integer logisticsnumber) {
        this.logisticsnumber = logisticsnumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Double discounts) {
        this.discounts = discounts;
    }

    public Double getShopvolume() {
        return shopvolume;
    }

    public void setShopvolume(Double shopvolume) {
        this.shopvolume = shopvolume;
    }

    public Double getFireight() {
        return fireight;
    }

    public void setFireight(Double fireight) {
        this.fireight = fireight;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getUaId() {
        return uaId;
    }

    public void setUaId(Integer uaId) {
        this.uaId = uaId;
    }

    public Integer getXxId() {
        return xxId;
    }

    public void setXxId(Integer xxId) {
        this.xxId = xxId;
    }
}