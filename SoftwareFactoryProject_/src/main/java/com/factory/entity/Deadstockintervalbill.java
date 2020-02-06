package com.factory.entity;

public class Deadstockintervalbill {
    private Integer dsibid;

    private Integer startday;

    private Integer overday;

    private String dsiexplain;

    private String standby;

    public Integer getDsibid() {
        return dsibid;
    }

    public void setDsibid(Integer dsibid) {
        this.dsibid = dsibid;
    }

    public Integer getStartday() {
        return startday;
    }

    public void setStartday(Integer startday) {
        this.startday = startday;
    }

    public Integer getOverday() {
        return overday;
    }

    public void setOverday(Integer overday) {
        this.overday = overday;
    }

    public String getDsiexplain() {
        return dsiexplain;
    }

    public void setDsiexplain(String dsiexplain) {
        this.dsiexplain = dsiexplain;
    }

    public String getStandby() {
        return standby;
    }

    public void setStandby(String standby) {
        this.standby = standby;
    }
}