package top.catotaku.common.pojo.po;

public class Videodata {
    private Integer id;

    private Integer uId;

    private Integer name;

    private String videourl;

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

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
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