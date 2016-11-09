package cn.edu.nuc.ssm.model;

import java.util.Date;

public class Levmessage {
	
	/*---------------------防覆盖护体盾-------------------------*/
    private Integer levmsgeid;

	private Integer userid;

	private Integer plevmsgid;

	private String levmsginfo;

	private Date levmsgtime;

	public Integer getLevmsgeid() {
		return levmsgeid;
	}

	public void setLevmsgeid(Integer levmsgeid) {
		this.levmsgeid = levmsgeid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getPlevmsgid() {
		return plevmsgid;
	}

	public void setPlevmsgid(Integer plevmsgid) {
		this.plevmsgid = plevmsgid;
	}

	public String getLevmsginfo() {
		return levmsginfo;
	}

	public void setLevmsginfo(String levmsginfo) {
		this.levmsginfo = levmsginfo == null ? null : levmsginfo.trim();
	}

	public Date getLevmsgtime() {
		return levmsgtime;
	}

	public void setLevmsgtime(Date levmsgtime) {
		this.levmsgtime = levmsgtime;
	}

	
	/*---------------------防覆盖护体盾-------------------------*/
	
}