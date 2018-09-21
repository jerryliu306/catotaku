package top.catotaku.common.pojo.po;

public class Pricturedata {
    private Integer id;

    private Integer uId;

    private String name;

    private String prictureurl;

    private Integer status;

    private Integer xxId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPrictureurl() {
        return prictureurl;
    }

    public void setPrictureurl(String prictureurl) {
        this.prictureurl = prictureurl == null ? null : prictureurl.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getXxId() {
        return xxId;
    }

    public void setXxId(Integer xxId) {
        this.xxId = xxId;
    }
}