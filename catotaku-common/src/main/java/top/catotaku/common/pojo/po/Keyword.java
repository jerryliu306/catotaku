package top.catotaku.common.pojo.po;

public class Keyword {
    private Integer id;

    private String name;

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

    public Integer getXxId() {
        return xxId;
    }

    public void setXxId(Integer xxId) {
        this.xxId = xxId;
    }
}