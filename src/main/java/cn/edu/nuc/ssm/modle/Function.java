package cn.edu.nuc.ssm.modle;

public class Function {
    private Integer funid;

    private String funname;

    private String funurl;

    private Integer funsta;

    public Integer getFunid() {
        return funid;
    }

    public void setFunid(Integer funid) {
        this.funid = funid;
    }

    public String getFunname() {
        return funname;
    }

    public void setFunname(String funname) {
        this.funname = funname == null ? null : funname.trim();
    }

    public String getFunurl() {
        return funurl;
    }

    public void setFunurl(String funurl) {
        this.funurl = funurl == null ? null : funurl.trim();
    }

    public Integer getFunsta() {
        return funsta;
    }

    public void setFunsta(Integer funsta) {
        this.funsta = funsta;
    }
}