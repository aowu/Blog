package cn.edu.nuc.ssm.model;

import java.util.Date;

public class Essay {
	
	/*---------------------防覆盖护体盾-------------------------*/
    private Integer esyid;

	private Integer userid;

	private String esyname;

	private String esysummary;

	private String esyurl;

	private Integer esysta;

	private Date esytime;

	public Integer getEsyid() {
		return esyid;
	}

	public void setEsyid(Integer esyid) {
		this.esyid = esyid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getEsyname() {
		return esyname;
	}

	public void setEsyname(String esyname) {
		this.esyname = esyname == null ? null : esyname.trim();
	}

	public String getEsysummary() {
		return esysummary;
	}

	public void setEsysummary(String esysummary) {
		this.esysummary = esysummary == null ? null : esysummary.trim();
	}

	public String getEsyurl() {
		return esyurl;
	}

	public void setEsyurl(String esyurl) {
		this.esyurl = esyurl == null ? null : esyurl.trim();
	}

	public Integer getEsysta() {
		return esysta;
	}

	public void setEsysta(Integer esysta) {
		this.esysta = esysta;
	}

	public Date getEsytime() {
		return esytime;
	}

	public void setEsytime(Date esytime) {
		this.esytime = esytime;
	}

	

	@Override
	public String toString() {
		return "Essay [esyid=" + esyid + ", userid=" + userid + ", esyname=" + esyname + ", esysummary=" + esysummary
				+ ", esyurl=" + esyurl + ", esysta=" + esysta + ", esytime=" + esytime + "]";
	}
	
	/*---------------------防覆盖护体盾-------------------------*/
    
}