package cn.edu.nuc.ssm.model;

import java.util.Date;

public class Comment {
    private Integer commentid;

	private Integer funid;

	private String commentinfo;

	private Integer pcommentid;

	private Date commenttime;

	private Integer fcommentid;

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
		this.commentinfo = commentinfo == null ? null : commentinfo.trim();
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

	
}