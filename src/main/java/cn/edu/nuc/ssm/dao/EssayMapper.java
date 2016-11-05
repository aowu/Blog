package cn.edu.nuc.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.nuc.ssm.model.Essay;

public interface EssayMapper {
    int deleteByPrimaryKey(Integer esyid);

    int insert(Essay record);

    int insertSelective(Essay record);

    Essay selectByPrimaryKey(Integer esyid);

    int updateByPrimaryKeySelective(Essay record);

    int updateByPrimaryKey(Essay record);
    
    List<Essay> selectAllEssay(@Param("userid")Integer userid, @Param("start")Integer start,@Param("offset")Integer offset);
    
    int selectAllCount(Integer userid);
    
    int selectMaxEsyid();
    
}