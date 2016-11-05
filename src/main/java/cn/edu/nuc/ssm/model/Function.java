package cn.edu.nuc.ssm.model;

public class Function {
    private Integer funid;

	private String funname;

	private String funurl;

	private Integer funsta;

	private Integer funpid;

	private String funpname;

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

	public Integer getFunpid() {
		return funpid;
	}

	public void setFunpid(Integer funpid) {
		this.funpid = funpid;
	}

	public String getFunpname() {
		return funpname;
	}

	public void setFunpname(String funpname) {
		this.funpname = funpname == null ? null : funpname.trim();
	}

	
	@Override
	public String toString() {
		return "Function [funid=" + funid + ", funname=" + funname + ", funurl=" + funurl + ", funsta=" + funsta
				+ ", funpid=" + funpid + ", funpname=" + funpname + "]";
	}
    
}