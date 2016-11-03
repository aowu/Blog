package cn.edu.nuc.ssm.modle;

public class Roles {
    private Integer roleid;

    private String rolename;

    private Integer rolesta;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Integer getRolesta() {
        return rolesta;
    }

    public void setRolesta(Integer rolesta) {
        this.rolesta = rolesta;
    }
}