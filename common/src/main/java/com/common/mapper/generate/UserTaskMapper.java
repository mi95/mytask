package com.common.mapper.generate;

import com.common.pojo.generate.UserTask;
import com.common.pojo.generate.UserTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xiaomi
 * @create 2021/4/6
 **/
@Mapper
public interface UserTaskMapper {
    long countByExample(UserTaskExample example);

    int deleteByExample(UserTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTask record);

    int insertOrUpdate(UserTask record);

    int insertOrUpdateSelective(UserTask record);

    int insertSelective(UserTask record);

    List<UserTask> selectByExample(UserTaskExample example);

    UserTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserTask record, @Param("example") UserTaskExample example);

    int updateByExample(@Param("record") UserTask record, @Param("example") UserTaskExample example);

    int updateByPrimaryKeySelective(UserTask record);

    int updateByPrimaryKey(UserTask record);

    int updateBatch(List<UserTask> list);

    int updateBatchSelective(List<UserTask> list);

    int batchInsert(@Param("list") List<UserTask> list);
}