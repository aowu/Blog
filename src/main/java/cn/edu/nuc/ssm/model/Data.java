package cn.edu.nuc.ssm.model;

public class Data {
    private Integer dataid;

    private Integer userid;

    private String dataurl;

    public Integer getDataid() {
        return dataid;
    }

    public void setDataid(Integer dataid) {
        this.dataid = dataid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getDataurl() {
        return dataurl;
    }

    public void setDataurl(String dataurl) {
        this.dataurl = dataurl == null ? null : dataurl.trim();
    }
}