package top.catotaku.common.pojo.po;

import java.util.Date;

public class Commodityevaluation {
    private Integer id;

    private Integer cId;

    private Integer buyUId;

    private Integer sellUId;

    private Integer buyLeavel;

    private Integer sellLeavel;

    private String buyMessage;

    private String sellMessage;

    private Integer pdId;

    private Integer commodityconformity;

    private Integer servuceattitude;

    private Integer deliveryspeed;

    private Date wvaluationdate;

    private Integer xxId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getBuyUId() {
        return buyUId;
    }

    public void setBuyUId(Integer buyUId) {
        this.buyUId = buyUId;
    }

    public Integer getSellUId() {
        return sellUId;
    }

    public void setSellUId(Integer sellUId) {
        this.sellUId = sellUId;
    }

    public Integer getBuyLeavel() {
        return buyLeavel;
    }

    public void setBuyLeavel(Integer buyLeavel) {
        this.buyLeavel = buyLeavel;
    }

    public Integer getSellLeavel() {
        return sellLeavel;
    }

    public void setSellLeavel(Integer sellLeavel) {
        this.sellLeavel = sellLeavel;
    }

    public String getBuyMessage() {
        return buyMessage;
    }

    public void setBuyMessage(String buyMessage) {
        this.buyMessage = buyMessage == null ? null : buyMessage.trim();
    }

    public String getSellMessage() {
        return sellMessage;
    }

    public void setSellMessage(String sellMessage) {
        this.sellMessage = sellMessage == null ? null : sellMessage.trim();
    }

    public Integer getPdId() {
        return pdId;
    }

    public void setPdId(Integer pdId) {
        this.pdId = pdId;
    }

    public Integer getCommodityconformity() {
        return commodityconformity;
    }

    public void setCommodityconformity(Integer commodityconformity) {
        this.commodityconformity = commodityconformity;
    }

    public Integer getServuceattitude() {
        return servuceattitude;
    }

    public void setServuceattitude(Integer servuceattitude) {
        this.servuceattitude = servuceattitude;
    }

    public Integer getDeliveryspeed() {
        return deliveryspeed;
    }

    public void setDeliveryspeed(Integer deliveryspeed) {
        this.deliveryspeed = deliveryspeed;
    }

    public Date getWvaluationdate() {
        return wvaluationdate;
    }

    public void setWvaluationdate(Date wvaluationdate) {
        this.wvaluationdate = wvaluationdate;
    }

    public Integer getXxId() {
        return xxId;
    }

    public void setXxId(Integer xxId) {
        this.xxId = xxId;
    }
}