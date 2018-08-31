package top.catotaku.common.pojo.po;

import java.util.Date;

public class Videoleavemessage {
    private Integer id;

    private Integer viId;

    private Integer uId;

    private String leavemessage;

    private Date leavemessagedate;

    private Integer vlmId;

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

    public String getLeavemessage() {
        return leavemessage;
    }

    public void setLeavemessage(String leavemessage) {
        this.leavemessage = leavemessage == null ? null : leavemessage.trim();
    }

    public Date getLeavemessagedate() {
        return leavemessagedate;
    }

    public void setLeavemessagedate(Date leavemessagedate) {
        this.leavemessagedate = leavemessagedate;
    }

    public Integer getVlmId() {
        return vlmId;
    }

    public void setVlmId(Integer vlmId) {
        this.vlmId = vlmId;
    }

    public Integer getXxId() {
        return xxId;
    }

    public void setXxId(Integer xxId) {
        this.xxId = xxId;
    }
}