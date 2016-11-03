package cn.edu.nuc.ssm.model;

import java.util.Date;

public class Reply {
    private Integer replyid;

    private Integer commentid;

    private String replyinfo;

    private Integer prtocid;

    private Date replytime;

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

    public Integer getPrtocid() {
        return prtocid;
    }

    public void setPrtocid(Integer prtocid) {
        this.prtocid = prtocid;
    }

    public Date getReplytime() {
        return replytime;
    }

    public void setReplytime(Date replytime) {
        this.replytime = replytime;
    }
}