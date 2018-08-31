package top.catotaku.common.pojo.po;

import java.util.Date;

public class Videobarrage {
    private Integer id;

    private Integer viId;

    private Integer uId;

    private String barrage;

    private Date videodate;

    private Date varragedate;

    private String varragecolor;

    private Integer xxId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getViId() {
        return viId;
    }

    public void setViId(Integer viId) {
        this.viId = viId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getBarrage() {
        return barrage;
    }

    public void setBarrage(String barrage) {
        this.barrage = barrage == null ? null : barrage.trim();
    }

    public Date getVideodate() {
        return videodate;
    }

    public void setVideodate(Date videodate) {
        this.videodate = videodate;
    }

    public Date getVarragedate() {
        return varragedate;
    }

    public void setVarragedate(Date varragedate) {
        this.varragedate = varragedate;
    }

    public String getVarragecolor() {
        return varragecolor;
    }

    public void setVarragecolor(String varragecolor) {
        this.varragecolor = varragecolor == null ? null : varragecolor.trim();
    }

    public Integer getXxId() {
        return xxId;
    }

    public void setXxId(Integer xxId) {
        this.xxId = xxId;
    }
}