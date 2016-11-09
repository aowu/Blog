package cn.edu.nuc.ssm.model;

import java.util.Date;

public class Reply {
	
	/*---------------------防覆盖护体盾-------------------------*/
	
	private Integer replyid;

	private Integer commentid;

	private String replyinfo;

	private Integer preplyid;

	private Date replytime;

	private Integer freplyid;

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
		this.replyinfo = replyinfo == null ? null : replyinfo.trim();
	}

	public Integer getPreplyid() {
		return preplyid;
	}

	public void setPreplyid(Integer preplyid) {
		this.preplyid = preplyid;
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

	@Override
	public String toString() {
		return "Reply [replyid=" + replyid + ", commentid=" + commentid + ", replyinfo=" + replyinfo + ", preplyid="
				+ preplyid + ", replytime=" + replytime + ", freplyid=" + freplyid + "]";
	}

	
    

	
	/*---------------------防覆盖护体盾-------------------------*/
	
}