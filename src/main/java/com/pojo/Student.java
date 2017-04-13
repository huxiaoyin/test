package com.pojo;

public class Student {
    private Integer sid;

    private String sname;

    private Integer cid;

    public Student(Integer sid, String sname, Integer cid) {
        this.sid = sid;
        this.sname = sname;
        this.cid = cid;
    }

    public Student() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}