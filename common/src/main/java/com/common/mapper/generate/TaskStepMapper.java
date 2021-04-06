package com.common.mapper.generate;

import com.common.pojo.generate.TaskStep;
import com.common.pojo.generate.TaskStepExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xiaomi
 * @create 2021/4/6
 **/
@Mapper
public interface TaskStepMapper {
    long countByExample(TaskStepExample example);

    int deleteByExample(TaskStepExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskStep record);

    int insertOrUpdate(TaskStep record);

    int insertOrUpdateSelective(TaskStep record);

    int insertSelective(TaskStep record);

    List<TaskStep> selectByExample(TaskStepExample example);

    TaskStep selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaskStep record, @Param("example") TaskStepExample example);

    int updateByExample(@Param("record") TaskStep record, @Param("example") TaskStepExample example);

    int updateByPrimaryKeySelective(TaskStep record);

    int updateByPrimaryKey(TaskStep record);

    int updateBatch(List<TaskStep> list);

    int updateBatchSelective(List<TaskStep> list);

    int batchInsert(@Param("list") List<TaskStep> list);
}