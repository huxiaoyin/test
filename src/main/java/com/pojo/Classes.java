package com.pojo;

public class Classes {
    private Integer cid;

    private String cname;

    public Classes(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Classes() {
        super();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }
}