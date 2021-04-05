package com.common.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


@Mapper
public interface TaskInfosCommonMapper {
    List<Map> selectTaskDetail(@Param("id")Integer id);
}