package cn.edu.nuc.ssm.model;

public class Data {
	


	/*---------------------防覆盖护体盾-------------------------*/
    private Integer dataid;

    private Integer userid;

    private String dataurl;

    private String dataname;

    private String rdataname;

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

    public String getDataname() {
        return dataname;
    }

    public void setDataname(String dataname) {
        this.dataname = dataname == null ? null : dataname.trim();
    }

    public String getRdataname() {
        return rdataname;
    }

    public void setRdataname(String rdataname) {
        this.rdataname = rdataname == null ? null : rdataname.trim();
    }
    
    /*---------------------防覆盖护体盾-------------------------*/
}