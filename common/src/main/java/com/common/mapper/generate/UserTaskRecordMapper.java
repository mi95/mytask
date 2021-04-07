package com.common.mapper.generate;

import com.common.pojo.generate.UserTaskRecord;
import com.common.pojo.generate.UserTaskRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author  xiaomi
 * @create  2021/4/7
 * 
 **/
@Mapper
public interface UserTaskRecordMapper {
    long countByExample(UserTaskRecordExample example);

    int deleteByExample(UserTaskRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTaskRecord record);

    int insertOrUpdate(UserTaskRecord record);

    int insertOrUpdateSelective(UserTaskRecord record);

    int insertSelective(UserTaskRecord record);

    List<UserTaskRecord> selectByExample(UserTaskRecordExample example);

    UserTaskRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserTaskRecord record, @Param("example") UserTaskRecordExample example);

    int updateByExample(@Param("record") UserTaskRecord record, @Param("example") UserTaskRecordExample example);

    int updateByPrimaryKeySelective(UserTaskRecord record);

    int updateByPrimaryKey(UserTaskRecord record);

    int updateBatch(List<UserTaskRecord> list);

    int updateBatchSelective(List<UserTaskRecord> list);

    int batchInsert(@Param("list") List<UserTaskRecord> list);
}