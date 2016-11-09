package cn.edu.nuc.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.nuc.ssm.model.Levmessage;

public interface LevmessageMapper {
    

	int deleteByPrimaryKey(Integer levmsgeid);

    int insert(Levmessage record);

    int insertSelective(Levmessage record);

    Levmessage selectByPrimaryKey(Integer levmsgeid);

    int updateByPrimaryKeySelective(Levmessage record);

    int updateByPrimaryKey(Levmessage record);
    
    List<Levmessage> selectByUserid(@Param("userid")Integer userid, @Param("start")Integer start,@Param("offset")Integer offset);
}