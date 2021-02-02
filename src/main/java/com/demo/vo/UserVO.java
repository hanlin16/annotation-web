package com.demo.vo;

import com.demo.annotation.parameter.Check;
import lombok.Data;

/**
 *  用户实体
 */
@Data
public class UserVO {
    /**
     * 姓名
     * */
    private String name;

    /**
     * 性别 male、female
     * */
    @Check(paramValues = {"male", "female"})
    private String gender;
}
