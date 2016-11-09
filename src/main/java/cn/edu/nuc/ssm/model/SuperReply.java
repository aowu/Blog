package cn.edu.nuc.ssm.model;

import java.util.Date;

public class SuperReply {

	private Integer replyid;

	private Integer commentid;

	private String replyinfo;

	private Integer preplyid;
	
	private String preplyname;
	
	private String ppictureurl;

	private Date replytime;
	
	private Integer freplyid;
	
	private String freplyname;
	
	private String fpictureurl;

	public Integer getReplyid() {
		return replyid;
	}

	public void setReplyid(Integer replyid) {
		this.replyid = replyid;
	}

	public Integer getCommentid() {
		return commentid;
	}

	public void setCommentid(Integer commentid) {
		this.commentid = commentid;
	}

	public String getReplyinfo() {
		return replyinfo;
	}

	public void setReplyinfo(String replyinfo) {
		this.replyinfo = replyinfo;
	}

	public Integer getPreplyid() {
		return preplyid;
	}

	public void setPreplyid(Integer preplyid) {
		this.preplyid = preplyid;
	}

	public String getPreplyname() {
		return preplyname;
	}

	public void setPreplyname(String preplyname) {
		this.preplyname = preplyname;
	}

	public String getPpictureurl() {
		return ppictureurl;
	}

	public void setPpictureurl(String ppictureurl) {
		this.ppictureurl = ppictureurl;
	}

	public Date getReplytime() {
		return replytime;
	}

	public void setReplytime(Date replytime) {
		this.replytime = replytime;
	}

	public Integer getFreplyid() {
		return freplyid;
	}

	public void setFreplyid(Integer freplyid) {
		this.freplyid = freplyid;
	}

	public String getFreplyname() {
		return freplyname;
	}

	public void setFreplyname(String freplyname) {
		this.freplyname = freplyname;
	}

	public String getFpictureurl() {
		return fpictureurl;
	}

	public void setFpictureurl(String fpictureurl) {
		this.fpictureurl = fpictureurl;
	}

	@Override
	public String toString() {
		return "SuperReply [replyid=" + replyid + ", commentid=" + commentid + ", replyinfo=" + replyinfo
				+ ", preplyid=" + preplyid + ", preplyname=" + preplyname + ", ppictureurl=" + ppictureurl
				+ ", replytime=" + replytime + ", freplyid=" + freplyid + ", freplyname=" + freplyname
				+ ", fpictureurl=" + fpictureurl + "]";
	}
	
	
}
