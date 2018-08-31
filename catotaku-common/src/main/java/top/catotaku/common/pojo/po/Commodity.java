package top.catotaku.common.pojo.po;

import java.util.Date;

public class Commodity {
    private Integer id;

    private String name;

    private Integer pdId;

    private Integer ccId;

    private Integer dId;

    private Double price;

    private Double salesprice;

    private Integer sId;

    private Integer sccId;

    private Integer status;

    private Date createdate;

    private Date soldoutdate;

    private Date deletedate;

    private Integer monthlysales;

    private Integer totalsales;

    private Integer inventory;

    private Integer cpcId;

    private Integer type;

    private Integer xxId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPdId() {
        return pdId;
    }

    public void setPdId(Integer pdId) {
        this.pdId = pdId;
    }

    public Integer getCcId() {
        return ccId;
    }

    public void setCcId(Integer ccId) {
        this.ccId = ccId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSalesprice() {
        return salesprice;
    }

    public void setSalesprice(Double salesprice) {
        this.salesprice = salesprice;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getSccId() {
        return sccId;
    }

    public void setSccId(Integer sccId) {
        this.sccId = sccId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getSoldoutdate() {
        return soldoutdate;
    }

    public void setSoldoutdate(Date soldoutdate) {
        this.soldoutdate = soldoutdate;
    }

    public Date getDeletedate() {
        return deletedate;
    }

    public void setDeletedate(Date deletedate) {
        this.deletedate = deletedate;
    }

    public Integer getMonthlysales() {
        return monthlysales;
    }

    public void setMonthlysales(Integer monthlysales) {
        this.monthlysales = monthlysales;
    }

    public Integer getTotalsales() {
        return totalsales;
    }

    public void setTotalsales(Integer totalsales) {
        this.totalsales = totalsales;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getCpcId() {
        return cpcId;
    }

    public void setCpcId(Integer cpcId) {
        this.cpcId = cpcId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getXxId() {
        return xxId;
    }

    public void setXxId(Integer xxId) {
        this.xxId = xxId;
    }
}