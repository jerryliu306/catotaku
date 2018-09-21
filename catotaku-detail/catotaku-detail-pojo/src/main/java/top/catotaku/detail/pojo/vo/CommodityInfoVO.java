package top.catotaku.detail.pojo.vo;

import top.catotaku.common.pojo.po.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author catotaku
 */
public class CommodityInfoVO implements Serializable {

    private static final long serialVersionUID = 4489840830584083359L;

    private Integer id;

    private String name;

    private Double price;

    private Double salesPrice;

    private Integer monthlySales;

    private Integer totalSales;

    private Integer inventory;

    private String particulars;

    private List<Commodityspecification> specification;

    private String prictureUrl;

    private Integer storeid;

    private String storename;

    private String storeintroduce;

    private Integer evaluate;

    private String sellname;

    private String districtname;

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
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Integer getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(Integer monthlySales) {
        this.monthlySales = monthlySales;
    }

    public Integer getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Integer totalSales) {
        this.totalSales = totalSales;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public List<Commodityspecification> getSpecification() {
        return specification;
    }

    public void setSpecification(List<Commodityspecification> specification) {
        this.specification = specification;
    }

    public String getPrictureUrl() {
        return prictureUrl;
    }

    public void setPrictureUrl(String prictureUrl) {
        this.prictureUrl = prictureUrl;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public String getStoreintroduce() {
        return storeintroduce;
    }

    public void setStoreintroduce(String storeintroduce) {
        this.storeintroduce = storeintroduce;
    }

    public Integer getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(Integer evaluate) {
        this.evaluate = evaluate;
    }

    public String getSellname() {
        return sellname;
    }

    public void setSellname(String sellname) {
        this.sellname = sellname;
    }

    public String getDistrictname() {
        return districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname;
    }

    public String getParticulars() {
        return particulars;
    }

    public void setParticulars(String particulars) {
        this.particulars = particulars;
    }

    @Override
    public String toString() {
        return "CommodityInfoVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", salesPrice=" + salesPrice +
                ", monthlySales=" + monthlySales +
                ", totalSales=" + totalSales +
                ", inventory=" + inventory +
                ", particulars='" + particulars + '\'' +
                ", specification=" + specification +
                ", prictureUrl='" + prictureUrl + '\'' +
                ", storeid=" + storeid +
                ", storename='" + storename + '\'' +
                ", storeintroduce='" + storeintroduce + '\'' +
                ", evaluate=" + evaluate +
                ", sellname='" + sellname + '\'' +
                ", districtname='" + districtname + '\'' +
                '}';
    }
}
