package com.common.mapper.generate;

import com.common.pojo.generate.UserInfos;
import com.common.pojo.generate.UserInfosExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserInfosMapper {
    long countByExample(UserInfosExample example);

    int deleteByExample(UserInfosExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInfos record);

    int insertOrUpdate(UserInfos record);

    int insertOrUpdateSelective(UserInfos record);

    int insertSelective(UserInfos record);

    List<UserInfos> selectByExample(UserInfosExample example);

    UserInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserInfos record, @Param("example") UserInfosExample example);

    int updateByExample(@Param("record") UserInfos record, @Param("example") UserInfosExample example);

    int updateByPrimaryKeySelective(UserInfos record);

    int updateByPrimaryKey(UserInfos record);

    int updateBatch(List<UserInfos> list);

    int updateBatchSelective(List<UserInfos> list);

    int batchInsert(@Param("list") List<UserInfos> list);
}