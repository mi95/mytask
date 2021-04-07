package com.common.mapper.generate;

import com.common.pojo.generate.UserTaskImg;
import com.common.pojo.generate.UserTaskImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xiaomi
 * @create 2021/4/7
 **/
@Mapper
public interface UserTaskImgMapper {
    long countByExample(UserTaskImgExample example);

    int deleteByExample(UserTaskImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTaskImg record);

    int insertOrUpdate(UserTaskImg record);

    int insertOrUpdateSelective(UserTaskImg record);

    int insertSelective(UserTaskImg record);

    List<UserTaskImg> selectByExample(UserTaskImgExample example);

    UserTaskImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserTaskImg record, @Param("example") UserTaskImgExample example);

    int updateByExample(@Param("record") UserTaskImg record, @Param("example") UserTaskImgExample example);

    int updateByPrimaryKeySelective(UserTaskImg record);

    int updateByPrimaryKey(UserTaskImg record);

    int updateBatch(List<UserTaskImg> list);

    int updateBatchSelective(List<UserTaskImg> list);

    int batchInsert(@Param("list") List<UserTaskImg> list);
}