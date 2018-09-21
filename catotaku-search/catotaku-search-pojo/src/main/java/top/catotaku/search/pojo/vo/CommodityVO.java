package top.catotaku.search.pojo.vo;

import top.catotaku.common.pojo.po.Commodity;

import java.io.Serializable;

/**
 * @author catotaku
 */
public class CommodityVO implements Serializable {

    private static final long serialVersionUID = 3816985833575639141L;
    private Long id;
    private String name;
    private String prictureUrl;
    private double price;
    private double salesprice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrictureUrl() {
        return prictureUrl;
    }

    public void setPrictureUrl(String prictureUrl) {
        this.prictureUrl = prictureUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSalesprice() {
        return salesprice;
    }

    public void setSalesprice(double salesprice) {
        this.salesprice = salesprice;
    }

    @Override
    public String toString() {
        return "CommodityVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prictureUrl='" + prictureUrl + '\'' +
                ", price=" + price +
                ", salesprice=" + salesprice +
                '}';
    }
}
