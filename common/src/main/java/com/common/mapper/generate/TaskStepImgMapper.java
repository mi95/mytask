package com.common.mapper.generate;

import com.common.pojo.generate.TaskStepImg;
import com.common.pojo.generate.TaskStepImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TaskStepImgMapper {
    long countByExample(TaskStepImgExample example);

    int deleteByExample(TaskStepImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskStepImg record);

    int insertOrUpdate(TaskStepImg record);

    int insertOrUpdateSelective(TaskStepImg record);

    int insertSelective(TaskStepImg record);

    List<TaskStepImg> selectByExample(TaskStepImgExample example);

    TaskStepImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaskStepImg record, @Param("example") TaskStepImgExample example);

    int updateByExample(@Param("record") TaskStepImg record, @Param("example") TaskStepImgExample example);

    int updateByPrimaryKeySelective(TaskStepImg record);

    int updateByPrimaryKey(TaskStepImg record);

    int updateBatch(List<TaskStepImg> list);

    int updateBatchSelective(List<TaskStepImg> list);

    int batchInsert(@Param("list") List<TaskStepImg> list);
}