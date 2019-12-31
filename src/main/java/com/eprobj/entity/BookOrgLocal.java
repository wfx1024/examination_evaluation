package com.eprobj.entity;

/**
 * Created by WXX on 2019/12/31.
 */
public class BookOrgLocal {
    private int id;
    private String liscence;
    private String dwmc;
    private String callman;
    private String professional;
    private String cel;
    private String phone;
    private String email;
    private String  address;
    private String  cbdwlb;
    private String region;
    private String  Localclassification;
    private String  main;
    private String  workunit;
    private int page=0;
    private int limit=20;

    public int getPage () {
        return page;
    }

    public void setPage ( int page ) {
        this.page = page;
    }

    public int getLimit () {
        return limit;
    }

    public void setLimit ( int limit ) {
        this.limit = limit;
    }

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getLiscence () {
        return liscence;
    }

    public void setLiscence ( String liscence ) {
        this.liscence = liscence;
    }

    public String getDwmc () {
        return dwmc;
    }

    public void setDwmc ( String dwmc ) {
        this.dwmc = dwmc;
    }

    public String getCallman () {
        return callman;
    }

    public void setCallman ( String callman ) {
        this.callman = callman;
    }

    public String getProfessional () {
        return professional;
    }

    public void setProfessional ( String professional ) {
        this.professional = professional;
    }

    public String getCel () {
        return cel;
    }

    public void setCel ( String cel ) {
        this.cel = cel;
    }

    public String getPhone () {
        return phone;
    }

    public void setPhone ( String phone ) {
        this.phone = phone;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress ( String address ) {
        this.address = address;
    }

    public String getCbdwlb () {
        return cbdwlb;
    }

    public void setCbdwlb ( String cbdwlb ) {
        this.cbdwlb = cbdwlb;
    }

    public String getRegion () {
        return region;
    }

    public void setRegion ( String region ) {
        this.region = region;
    }

    public String getLocalclassification () {
        return Localclassification;
    }

    public void setLocalclassification ( String localclassification ) {
        Localclassification = localclassification;
    }

    public String getMain () {
        return main;
    }

    public void setMain ( String main ) {
        this.main = main;
    }

    public String getWorkunit () {
        return workunit;
    }

    public void setWorkunit ( String workunit ) {
        this.workunit = workunit;
    }
}
