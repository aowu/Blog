package cn.edu.nuc.ssm.model;

import java.util.Date;
import java.util.List;

public class SuperComment {

	private Integer commentid;

	private Integer funid;

	private String commentinfo;

	private Integer pcommentid;
	
	private Date commenttime;
	
	private Integer fcommentid;
	
	private String fcommentname;
	
	private String fpictureurl;
	
	private List<SuperReply> replys;

	public Integer getCommentid() {
		return commentid;
	}

	public void setCommentid(Integer commentid) {
		this.commentid = commentid;
	}

	public Integer getFunid() {
		return funid;
	}

	public void setFunid(Integer funid) {
		this.funid = funid;
	}

	public String getCommentinfo() {
		return commentinfo;
	}

	public void setCommentinfo(String commentinfo) {
		this.commentinfo = commentinfo;
	}

	public Integer getPcommentid() {
		return pcommentid;
	}

	public void setPcommentid(Integer pcommentid) {
		this.pcommentid = pcommentid;
	}

	public Date getCommenttime() {
		return commenttime;
	}

	public void setCommenttime(Date commenttime) {
		this.commenttime = commenttime;
	}

	public Integer getFcommentid() {
		return fcommentid;
	}

	public void setFcommentid(Integer fcommentid) {
		this.fcommentid = fcommentid;
	}

	public String getFcommentname() {
		return fcommentname;
	}

	public void setFcommentname(String fcommentname) {
		this.fcommentname = fcommentname;
	}

	public String getFpictureurl() {
		return fpictureurl;
	}

	public void setFpictureurl(String fpictureurl) {
		this.fpictureurl = fpictureurl;
	}

	public List<SuperReply> getReplys() {
		return replys;
	}

	public void setReplys(List<SuperReply> replys) {
		this.replys = replys;
	}

	@Override
	public String toString() {
		return "SuperComment [commentid=" + commentid + ", funid=" + funid + ", commentinfo=" + commentinfo
				+ ", pcommentid=" + pcommentid + ", commenttime=" + commenttime + ", fcommentid=" + fcommentid
				+ ", fcommentname=" + fcommentname + ", fpictureurl=" + fpictureurl + ", replys=" + replys + "]";
	}

	
}
