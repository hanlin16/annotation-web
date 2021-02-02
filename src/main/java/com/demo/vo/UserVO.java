package com.demo.vo;

import com.demo.annotation.parameter.CheckNotBlank;
import com.demo.annotation.parameter.CheckValues;
import lombok.Data;

/**
 * 用户
 */
@Data
public class UserVO {
    /**
     * 姓名
     */
    @CheckNotBlank
    private String name;

    /**
     * 性别 male、female
     */
    @CheckValues(paramValues = {"male", "female"})
    private String gender;
}
