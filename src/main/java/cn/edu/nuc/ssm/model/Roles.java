package cn.edu.nuc.ssm.model;

public class Roles {
	
	/*---------------------防覆盖护体盾-------------------------*/
    private Integer roleid;

	private String rolename;

	private Integer rolesta;

	private String roleinfo;

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

	public String getRoleinfo() {
		return roleinfo;
	}

	public void setRoleinfo(String roleinfo) {
		this.roleinfo = roleinfo == null ? null : roleinfo.trim();
	}

	/*---------------------防覆盖护体盾-------------------------*/
}