package cn.edu.nuc.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.nuc.ssm.model.Comment;
import cn.edu.nuc.ssm.model.SuperComment;

public interface CommentMapper {
    
	
	/*-------------------放覆盖护体盾--------------------------*/

	int deleteByPrimaryKey(Integer commentid);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer commentid);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
    
    List<Comment> selectByUserid(@Param("pcommentid")Integer pcommentid, @Param("start")Integer start,@Param("offset")Integer offset);
    
    List<SuperComment> superSelectComment(@Param("pcommentid")Integer pcommentid, @Param("start")Integer start,@Param("offset")Integer offset);
    
    int selectAllCount(Integer pcommentid);
    
    int insertNoCommentid(Comment record);
    
    /*-------------------放覆盖护体盾--------------------------*/
}