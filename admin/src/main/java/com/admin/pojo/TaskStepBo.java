package com.admin.pojo;

import com.common.pojo.generate.TaskStep;
import lombok.Data;

import java.util.List;

/**
 * @author xiaomi
 * @create 2021/4/6
 **/
@Data
public class TaskStepBo {
    TaskStep step;

    List<String> imgUrls;

}
