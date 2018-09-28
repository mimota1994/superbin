package com.mmall.pojo;

import java.util.Date;

public class Ultrasonic {
    private Integer id;

    private Integer status;

    private Integer rpiId;

    private Integer loc;

    private Date createTime;

    public Ultrasonic(Integer id, Integer status, Integer rpiId, Integer loc, Date createTime) {
        this.id = id;
        this.status = status;
        this.rpiId = rpiId;
        this.loc = loc;
        this.createTime = createTime;
    }

    public Ultrasonic() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRpiId() {
        return rpiId;
    }

    public void setRpiId(Integer rpiId) {
        this.rpiId = rpiId;
    }

    public Integer getLoc() {
        return loc;
    }

    public void setLoc(Integer loc) {
        this.loc = loc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}