package top.catotaku.search.pojo.dto;

import java.io.Serializable;

public class PageInfo implements Serializable {
    private static final long serialVersionUID = -8349855248590727673L;
    /**
     * 关键字
     */
    private String keyword;
    /**
     * 是否优惠
     */
    private int sales;
    /**
     * 是否有存库
     */
    private int inventory;
    /**
     * 页面总页数
     */
    private int pageCount;
    /**
     * 当面页数
     */
    private int pageNum;
    /**
     * 数据总条数
     */
    private int itemCount;
    /**
     * 当前起始数据条数
     */
    private int itemNum;
    /**
     * 页面显示条数
     */
    private int itemSize;

    public void findPage() {
        if (itemSize<=0){
            itemSize = 10;
        }
        if (itemCount%itemSize==0) {
            pageCount = itemCount / itemSize;
        }else {
            pageCount = itemCount / itemSize + 1;
        }
        if(pageNum>pageCount) {
            pageNum = pageCount;
        }
        if(pageNum<=0) {
            pageNum = 1;
        }
        itemNum = (pageNum - 1) * itemSize;
    }

    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public int getPageNum() {
        return pageNum;
    }
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    public int getItemCount() {
        return itemCount;
    }
    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
    public int getItemNum() {
        return itemNum;
    }
    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }
    public int getItemSize() {
        return itemSize;
    }
    public void setItemSize(int itemSize) {
        this.itemSize = itemSize;
    }
    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
