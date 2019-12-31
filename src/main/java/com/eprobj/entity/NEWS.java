package com.eprobj.entity;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by WFX1024 on 2019/12/21.
 */
public class NEWS implements Serializable {

    private int	IR_SID;
    private String	IR_HKEY;
    private int	IR_STARTID;
    private String	IR_SERVICEID;
    private String	IR_PKEY;
    private String	IR_URLNAME;
    private String	IR_EXTNAME;
    private String	IR_SITENAME;
    private String	IR_CHANNEL;
    private String	IR_GROUPNAME;
    private String	IR_URLTITLE;
    private String	IR_URLTOPIC;
    private Date IR_LASTTIME;
    private Date	IR_URLDATE;
    private Date	IR_URLTIME;
    private Date	IR_LOADTIME;
    private String	IR_SRCNAME;
    private String	IR_AUTHORS;
    private String	IR_DISTRICT;
    private String	IR_CATALOG;
    private String	IR_CATALOG1;
    private String	IR_CATALOG2;
    private String	IR_KEYWORDS;
    private String	IR_ABSTRACT;
    private String	IR_SIMFLAG;
    private int	IR_SIMRANK;
    private int	IR_IMAGEFLAG;
    private int	IR_TABLEFLAG;
    private int	IR_DOCLENGTH;
    private String IR_CONTENT;
    private String IR_URLCONTENT;
    private int	IR_BBSNUM;
    private int	IR_BBSTOPIC;
    private String	IR_BBSKEY;
    private int	IR_PAGELEVEL;
    private int	IR_PAGERANK;
    private int	IR_URLLEVEL;
    private String	IR_MIMETYPE;
    private String	IR_FORMAT;
    private String	IR_CHARSET;
    private int	IR_URLSIZE;
    private String	IR_URLBODY;
    private int	IR_WCMID;
    private int	IR_STATUS;
    private int	IR_NRESERVED1;
    private int	IR_NRESERVED2;
    private int	IR_NRESERVED3;
    private String	IR_VRESERVED1;
    private String	IR_VRESERVED2;
    private String	IR_VRESERVED3;
    private String	IR_VRESERVED4;
    private String	IR_SRESERVED1;
    private String	IR_SRESERVED2;
    private String	IR_SRESERVED3;

    private String beginCreateTime;
    private String endCreateTime;

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

    public String getBeginCreateTime() {
        return beginCreateTime;
    }

    public void setBeginCreateTime(String beginCreateTime) {
        this.beginCreateTime = beginCreateTime;
    }

    public String getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(String endCreateTime) {
        this.endCreateTime = endCreateTime;
    }

    public int getIR_SID() {
        return IR_SID;
    }

    public void setIR_SID(int IR_SID) {
        this.IR_SID = IR_SID;
    }

    public String getIR_HKEY() {
        return IR_HKEY;
    }

    public void setIR_HKEY(String IR_HKEY) {
        this.IR_HKEY = IR_HKEY;
    }

    public int getIR_STARTID() {
        return IR_STARTID;
    }

    public void setIR_STARTID(int IR_STARTID) {
        this.IR_STARTID = IR_STARTID;
    }

    public String getIR_SERVICEID() {
        return IR_SERVICEID;
    }

    public void setIR_SERVICEID(String IR_SERVICEID) {
        this.IR_SERVICEID = IR_SERVICEID;
    }

    public String getIR_PKEY() {
        return IR_PKEY;
    }

    public void setIR_PKEY(String IR_PKEY) {
        this.IR_PKEY = IR_PKEY;
    }

    public String getIR_URLNAME() {
        return IR_URLNAME;
    }

    public void setIR_URLNAME(String IR_URLNAME) {
        this.IR_URLNAME = IR_URLNAME;
    }

    public String getIR_EXTNAME() {
        return IR_EXTNAME;
    }

    public void setIR_EXTNAME(String IR_EXTNAME) {
        this.IR_EXTNAME = IR_EXTNAME;
    }

    public String getIR_SITENAME() {
        return IR_SITENAME;
    }

    public void setIR_SITENAME(String IR_SITENAME) {
        this.IR_SITENAME = IR_SITENAME;
    }

    public String getIR_CHANNEL() {
        return IR_CHANNEL;
    }

    public void setIR_CHANNEL(String IR_CHANNEL) {
        this.IR_CHANNEL = IR_CHANNEL;
    }

    public String getIR_GROUPNAME() {
        return IR_GROUPNAME;
    }

    public void setIR_GROUPNAME(String IR_GROUPNAME) {
        this.IR_GROUPNAME = IR_GROUPNAME;
    }

    public String getIR_URLTITLE() {
        return IR_URLTITLE;
    }

    public void setIR_URLTITLE(String IR_URLTITLE) {
        this.IR_URLTITLE = IR_URLTITLE;
    }

    public String getIR_URLTOPIC() {
        return IR_URLTOPIC;
    }

    public void setIR_URLTOPIC(String IR_URLTOPIC) {
        this.IR_URLTOPIC = IR_URLTOPIC;
    }

    public Date getIR_LASTTIME() {
        return IR_LASTTIME;
    }

    public void setIR_LASTTIME(Date IR_LASTTIME) {
        this.IR_LASTTIME = IR_LASTTIME;
    }

    public Date getIR_URLDATE() {
        return IR_URLDATE;
    }

    public void setIR_URLDATE(Date IR_URLDATE) {
        this.IR_URLDATE = IR_URLDATE;
    }

    public Date getIR_URLTIME() {
        return IR_URLTIME;
    }

    public void setIR_URLTIME(Date IR_URLTIME) {
        this.IR_URLTIME = IR_URLTIME;
    }

    public Date getIR_LOADTIME() {
        return IR_LOADTIME;
    }

    public void setIR_LOADTIME(Date IR_LOADTIME) {
        this.IR_LOADTIME = IR_LOADTIME;
    }

    public String getIR_SRCNAME() {
        return IR_SRCNAME;
    }

    public void setIR_SRCNAME(String IR_SRCNAME) {
        this.IR_SRCNAME = IR_SRCNAME;
    }

    public String getIR_AUTHORS() {
        return IR_AUTHORS;
    }

    public void setIR_AUTHORS(String IR_AUTHORS) {
        this.IR_AUTHORS = IR_AUTHORS;
    }

    public String getIR_DISTRICT() {
        return IR_DISTRICT;
    }

    public void setIR_DISTRICT(String IR_DISTRICT) {
        this.IR_DISTRICT = IR_DISTRICT;
    }

    public String getIR_CATALOG() {
        return IR_CATALOG;
    }

    public void setIR_CATALOG(String IR_CATALOG) {
        this.IR_CATALOG = IR_CATALOG;
    }

    public String getIR_CATALOG1() {
        return IR_CATALOG1;
    }

    public void setIR_CATALOG1(String IR_CATALOG1) {
        this.IR_CATALOG1 = IR_CATALOG1;
    }

    public String getIR_CATALOG2() {
        return IR_CATALOG2;
    }

    public void setIR_CATALOG2(String IR_CATALOG2) {
        this.IR_CATALOG2 = IR_CATALOG2;
    }

    public String getIR_KEYWORDS() {
        return IR_KEYWORDS;
    }

    public void setIR_KEYWORDS(String IR_KEYWORDS) {
        this.IR_KEYWORDS = IR_KEYWORDS;
    }

    public String getIR_ABSTRACT() {
        return IR_ABSTRACT;
    }

    public void setIR_ABSTRACT(String IR_ABSTRACT) {
        this.IR_ABSTRACT = IR_ABSTRACT;
    }

    public String getIR_SIMFLAG() {
        return IR_SIMFLAG;
    }

    public void setIR_SIMFLAG(String IR_SIMFLAG) {
        this.IR_SIMFLAG = IR_SIMFLAG;
    }

    public int getIR_SIMRANK() {
        return IR_SIMRANK;
    }

    public void setIR_SIMRANK(int IR_SIMRANK) {
        this.IR_SIMRANK = IR_SIMRANK;
    }

    public int getIR_IMAGEFLAG() {
        return IR_IMAGEFLAG;
    }

    public void setIR_IMAGEFLAG(int IR_IMAGEFLAG) {
        this.IR_IMAGEFLAG = IR_IMAGEFLAG;
    }

    public int getIR_TABLEFLAG() {
        return IR_TABLEFLAG;
    }

    public void setIR_TABLEFLAG(int IR_TABLEFLAG) {
        this.IR_TABLEFLAG = IR_TABLEFLAG;
    }

    public int getIR_DOCLENGTH() {
        return IR_DOCLENGTH;
    }

    public void setIR_DOCLENGTH(int IR_DOCLENGTH) {
        this.IR_DOCLENGTH = IR_DOCLENGTH;
    }

    public int getIR_BBSNUM() {
        return IR_BBSNUM;
    }

    public void setIR_BBSNUM(int IR_BBSNUM) {
        this.IR_BBSNUM = IR_BBSNUM;
    }

    public int getIR_BBSTOPIC() {
        return IR_BBSTOPIC;
    }

    public void setIR_BBSTOPIC(int IR_BBSTOPIC) {
        this.IR_BBSTOPIC = IR_BBSTOPIC;
    }

    public String getIR_BBSKEY() {
        return IR_BBSKEY;
    }

    public void setIR_BBSKEY(String IR_BBSKEY) {
        this.IR_BBSKEY = IR_BBSKEY;
    }

    public int getIR_PAGELEVEL() {
        return IR_PAGELEVEL;
    }

    public void setIR_PAGELEVEL(int IR_PAGELEVEL) {
        this.IR_PAGELEVEL = IR_PAGELEVEL;
    }

    public int getIR_PAGERANK() {
        return IR_PAGERANK;
    }

    public void setIR_PAGERANK(int IR_PAGERANK) {
        this.IR_PAGERANK = IR_PAGERANK;
    }

    public int getIR_URLLEVEL() {
        return IR_URLLEVEL;
    }

    public void setIR_URLLEVEL(int IR_URLLEVEL) {
        this.IR_URLLEVEL = IR_URLLEVEL;
    }

    public String getIR_MIMETYPE() {
        return IR_MIMETYPE;
    }

    public void setIR_MIMETYPE(String IR_MIMETYPE) {
        this.IR_MIMETYPE = IR_MIMETYPE;
    }

    public String getIR_FORMAT() {
        return IR_FORMAT;
    }

    public void setIR_FORMAT(String IR_FORMAT) {
        this.IR_FORMAT = IR_FORMAT;
    }

    public String getIR_CHARSET() {
        return IR_CHARSET;
    }

    public void setIR_CHARSET(String IR_CHARSET) {
        this.IR_CHARSET = IR_CHARSET;
    }

    public int getIR_URLSIZE() {
        return IR_URLSIZE;
    }

    public void setIR_URLSIZE(int IR_URLSIZE) {
        this.IR_URLSIZE = IR_URLSIZE;
    }

    public int getIR_WCMID() {
        return IR_WCMID;
    }

    public void setIR_WCMID(int IR_WCMID) {
        this.IR_WCMID = IR_WCMID;
    }

    public int getIR_STATUS() {
        return IR_STATUS;
    }

    public void setIR_STATUS(int IR_STATUS) {
        this.IR_STATUS = IR_STATUS;
    }

    public int getIR_NRESERVED1() {
        return IR_NRESERVED1;
    }

    public void setIR_NRESERVED1(int IR_NRESERVED1) {
        this.IR_NRESERVED1 = IR_NRESERVED1;
    }

    public int getIR_NRESERVED2() {
        return IR_NRESERVED2;
    }

    public void setIR_NRESERVED2(int IR_NRESERVED2) {
        this.IR_NRESERVED2 = IR_NRESERVED2;
    }

    public int getIR_NRESERVED3() {
        return IR_NRESERVED3;
    }

    public void setIR_NRESERVED3(int IR_NRESERVED3) {
        this.IR_NRESERVED3 = IR_NRESERVED3;
    }

    public String getIR_VRESERVED1() {
        return IR_VRESERVED1;
    }

    public void setIR_VRESERVED1(String IR_VRESERVED1) {
        this.IR_VRESERVED1 = IR_VRESERVED1;
    }

    public String getIR_VRESERVED2() {
        return IR_VRESERVED2;
    }

    public void setIR_VRESERVED2(String IR_VRESERVED2) {
        this.IR_VRESERVED2 = IR_VRESERVED2;
    }

    public String getIR_VRESERVED3() {
        return IR_VRESERVED3;
    }

    public void setIR_VRESERVED3(String IR_VRESERVED3) {
        this.IR_VRESERVED3 = IR_VRESERVED3;
    }

    public String getIR_VRESERVED4() {
        return IR_VRESERVED4;
    }

    public void setIR_VRESERVED4(String IR_VRESERVED4) {
        this.IR_VRESERVED4 = IR_VRESERVED4;
    }

    public String getIR_SRESERVED1() {
        return IR_SRESERVED1;
    }

    public void setIR_SRESERVED1(String IR_SRESERVED1) {
        this.IR_SRESERVED1 = IR_SRESERVED1;
    }

    public String getIR_SRESERVED2() {
        return IR_SRESERVED2;
    }

    public void setIR_SRESERVED2(String IR_SRESERVED2) {
        this.IR_SRESERVED2 = IR_SRESERVED2;
    }

    public String getIR_SRESERVED3() {
        return IR_SRESERVED3;
    }

    public void setIR_SRESERVED3(String IR_SRESERVED3) {
        this.IR_SRESERVED3 = IR_SRESERVED3;
    }


    public String getIR_CONTENT() {
        return IR_CONTENT;
    }

    public void setIR_CONTENT(String IR_CONTENT) {
        this.IR_CONTENT = IR_CONTENT;
    }

    public String getIR_URLCONTENT() {
        return IR_URLCONTENT;
    }

    public void setIR_URLCONTENT(String IR_URLCONTENT) {
        this.IR_URLCONTENT = IR_URLCONTENT;
    }

    public String getIR_URLBODY() {
        return IR_URLBODY;
    }

    public void setIR_URLBODY(String IR_URLBODY) {
        this.IR_URLBODY = IR_URLBODY;
    }

    @Override
    public String toString() {
        return "NEWS{" +
                "IR_SID=" + IR_SID +
                ", IR_HKEY='" + IR_HKEY + '\'' +
                ", IR_STARTID=" + IR_STARTID +
                ", IR_SERVICEID='" + IR_SERVICEID + '\'' +
                ", IR_PKEY='" + IR_PKEY + '\'' +
                ", IR_URLNAME='" + IR_URLNAME + '\'' +
                ", IR_EXTNAME='" + IR_EXTNAME + '\'' +
                ", IR_SITENAME='" + IR_SITENAME + '\'' +
                ", IR_CHANNEL='" + IR_CHANNEL + '\'' +
                ", IR_GROUPNAME='" + IR_GROUPNAME + '\'' +
                ", IR_URLTITLE='" + IR_URLTITLE + '\'' +
                ", IR_URLTOPIC='" + IR_URLTOPIC + '\'' +
                ", IR_LASTTIME=" + IR_LASTTIME +
                ", IR_URLDATE=" + IR_URLDATE +
                ", IR_URLTIME=" + IR_URLTIME +
                ", IR_LOADTIME=" + IR_LOADTIME +
                ", IR_SRCNAME='" + IR_SRCNAME + '\'' +
                ", IR_AUTHORS='" + IR_AUTHORS + '\'' +
                ", IR_DISTRICT='" + IR_DISTRICT + '\'' +
                ", IR_CATALOG='" + IR_CATALOG + '\'' +
                ", IR_CATALOG1='" + IR_CATALOG1 + '\'' +
                ", IR_CATALOG2='" + IR_CATALOG2 + '\'' +
                ", IR_KEYWORDS='" + IR_KEYWORDS + '\'' +
                ", IR_ABSTRACT='" + IR_ABSTRACT + '\'' +
                ", IR_SIMFLAG='" + IR_SIMFLAG + '\'' +
                ", IR_SIMRANK=" + IR_SIMRANK +
                ", IR_IMAGEFLAG=" + IR_IMAGEFLAG +
                ", IR_TABLEFLAG=" + IR_TABLEFLAG +
                ", IR_DOCLENGTH=" + IR_DOCLENGTH +
                ", IR_CONTENT=" + IR_CONTENT +
                ", IR_URLCONTENT=" + IR_URLCONTENT +
                ", IR_BBSNUM=" + IR_BBSNUM +
                ", IR_BBSTOPIC=" + IR_BBSTOPIC +
                ", IR_BBSKEY='" + IR_BBSKEY + '\'' +
                ", IR_PAGELEVEL=" + IR_PAGELEVEL +
                ", IR_PAGERANK=" + IR_PAGERANK +
                ", IR_URLLEVEL=" + IR_URLLEVEL +
                ", IR_MIMETYPE='" + IR_MIMETYPE + '\'' +
                ", IR_FORMAT='" + IR_FORMAT + '\'' +
                ", IR_CHARSET='" + IR_CHARSET + '\'' +
                ", IR_URLSIZE=" + IR_URLSIZE +
                ", IR_URLBODY=" + IR_URLBODY +
                ", IR_WCMID=" + IR_WCMID +
                ", IR_STATUS=" + IR_STATUS +
                ", IR_NRESERVED1=" + IR_NRESERVED1 +
                ", IR_NRESERVED2=" + IR_NRESERVED2 +
                ", IR_NRESERVED3=" + IR_NRESERVED3 +
                ", IR_VRESERVED1='" + IR_VRESERVED1 + '\'' +
                ", IR_VRESERVED2='" + IR_VRESERVED2 + '\'' +
                ", IR_VRESERVED3='" + IR_VRESERVED3 + '\'' +
                ", IR_VRESERVED4='" + IR_VRESERVED4 + '\'' +
                ", IR_SRESERVED1='" + IR_SRESERVED1 + '\'' +
                ", IR_SRESERVED2='" + IR_SRESERVED2 + '\'' +
                ", IR_SRESERVED3='" + IR_SRESERVED3 + '\'' +
                '}';
    }
}
