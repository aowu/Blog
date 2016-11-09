package cn.edu.nuc.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.nuc.ssm.model.Reply;
import cn.edu.nuc.ssm.model.SuperReply;

public interface ReplyMapper {
    
	
	/*-------------------放覆盖护体盾--------------------------*/

	int deleteByPrimaryKey(Integer replyid);

    int insert(Reply record);

    int insertSelective(Reply record);

    Reply selectByPrimaryKey(Integer replyid);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKey(Reply record);
    
    List<Reply> selectAllByCommentid(@Param("commentid")Integer commentid, @Param("start")Integer start,@Param("offset")Integer offset);
    
    int selectAllCount(Integer commentid);
    
    List<SuperReply> SuperSelectReply(@Param("commentid")Integer commentid);
    
    /*-------------------放覆盖护体盾--------------------------*/
}