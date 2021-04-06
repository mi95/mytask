package com.common.mapper.generate;

import com.common.pojo.generate.TaskInfos;
import com.common.pojo.generate.TaskInfosExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xiaomi
 * @create 2021/4/6
 **/
@Mapper
public interface TaskInfosMapper {
    long countByExample(TaskInfosExample example);

    int deleteByExample(TaskInfosExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskInfos record);

    int insertOrUpdate(TaskInfos record);

    int insertOrUpdateSelective(TaskInfos record);

    int insertSelective(TaskInfos record);

    List<TaskInfos> selectByExample(TaskInfosExample example);

    TaskInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaskInfos record, @Param("example") TaskInfosExample example);

    int updateByExample(@Param("record") TaskInfos record, @Param("example") TaskInfosExample example);

    int updateByPrimaryKeySelective(TaskInfos record);

    int updateByPrimaryKey(TaskInfos record);

    int updateBatch(List<TaskInfos> list);

    int updateBatchSelective(List<TaskInfos> list);

    int batchInsert(@Param("list") List<TaskInfos> list);
}