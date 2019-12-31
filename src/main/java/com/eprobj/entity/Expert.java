package com.eprobj.entity;

public class Expert {
    private int IR_EID;
    private String  IR_ENAME;
    private String IR_ESUBJECT;
    private String IR_EWORKUNIT;
    private String IR_EDUTY;
    private String IR_EPROVINCE;
    private String IR_EPHONE;
    private String IR_ETERRITORY;
    private String IR_EUNITCATEGORY;
    private String IR_ECREATTIME;

    private int page=1;
    private int limit=20;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = (page-1)*limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }


    public int getIR_EID() {
        return IR_EID;
    }

    public void setIR_EID(int IR_EID) {
        this.IR_EID = IR_EID;
    }

    public String getIR_ENAME() {
        return IR_ENAME;
    }

    public void setIR_ENAME(String IR_ENAME) {
        this.IR_ENAME = IR_ENAME;
    }

    public String getIR_ESUBJECT() {
        return IR_ESUBJECT;
    }

    public void setIR_ESUBJECT(String IR_ESUBJECT) {
        this.IR_ESUBJECT = IR_ESUBJECT;
    }

    public String getIR_EWORKUNIT() {
        return IR_EWORKUNIT;
    }

    public void setIR_EWORKUNIT(String IR_EWORKUNIT) {
        this.IR_EWORKUNIT = IR_EWORKUNIT;
    }

    public String getIR_EDUTY() {
        return IR_EDUTY;
    }

    public void setIR_EDUTY(String IR_EDUTY) {
        this.IR_EDUTY = IR_EDUTY;
    }

    public String getIR_EPROVINCE() {
        return IR_EPROVINCE;
    }

    public void setIR_EPROVINCE(String IR_EPROVINCE) {
        this.IR_EPROVINCE = IR_EPROVINCE;
    }

    public String getIR_EPHONE() {
        return IR_EPHONE;
    }

    public void setIR_EPHONE(String IR_EPHONE) {
        this.IR_EPHONE = IR_EPHONE;
    }

    public String getIR_ETERRITORY() {
        return IR_ETERRITORY;
    }

    public void setIR_ETERRITORY(String IR_ETERRITORY) {
        this.IR_ETERRITORY = IR_ETERRITORY;
    }

    public String getIR_EUNITCATEGORY() {
        return IR_EUNITCATEGORY;
    }

    public void setIR_EUNITCATEGORY(String IR_EUNITCATEGORY) {
        this.IR_EUNITCATEGORY = IR_EUNITCATEGORY;
    }

    public String getIR_ECREATTIME() {
        return IR_ECREATTIME;
    }

    public void setIR_ECREATTIME(String IR_ECREATTIME) {
        this.IR_ECREATTIME = IR_ECREATTIME;
    }


    @Override
    public String toString() {
        return "Expert{" +
                "IR_EID=" + IR_EID +
                ", IR_ENAME='" + IR_ENAME + '\'' +
                ", IR_ESUBJECT='" + IR_ESUBJECT + '\'' +
                ", IR_EWORKUNIT='" + IR_EWORKUNIT + '\'' +
                ", IR_EDUTY='" + IR_EDUTY + '\'' +
                ", IR_EPROVINCE='" + IR_EPROVINCE + '\'' +
                ", IR_EPHONE='" + IR_EPHONE + '\'' +
                ", IR_ETERRITORY='" + IR_ETERRITORY + '\'' +
                ", IR_EUNITCATEGORY='" + IR_EUNITCATEGORY + '\'' +
                ", IR_ECREATTIME='" + IR_ECREATTIME + '\'' +
                '}';
    }
}
