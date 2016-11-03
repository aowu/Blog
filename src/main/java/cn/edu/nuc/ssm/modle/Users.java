package cn.edu.nuc.ssm.modle;

import java.util.Date;

public class Users {
    private Integer userid;

    private Integer infoid;

    private Integer roleid;

    private String usernum;

    private String userpas;

    private String pictureurl;

    private String username;

    private Date usertime;

    private Integer usersta;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getUsernum() {
        return usernum;
    }

    public void setUsernum(String usernum) {
        this.usernum = usernum == null ? null : usernum.trim();
    }

    public String getUserpas() {
        return userpas;
    }

    public void setUserpas(String userpas) {
        this.userpas = userpas == null ? null : userpas.trim();
    }

    public String getPictureurl() {
        return pictureurl;
    }

    public void setPictureurl(String pictureurl) {
        this.pictureurl = pictureurl == null ? null : pictureurl.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getUsertime() {
        return usertime;
    }

    public void setUsertime(Date usertime) {
        this.usertime = usertime;
    }

    public Integer getUsersta() {
        return usersta;
    }

    public void setUsersta(Integer usersta) {
        this.usersta = usersta;
    }
}