package com.demo.vo;

import com.demo.annotation.parameter.Check;
import lombok.Data;

/**
 *  用户实体
 *
 *
 * @Date:2020/2/1 21:33
 *
 */
@Data
public class User {
    /**
     * 姓名
     * */
    private String name;

    /**
     * 性别 man or women
     * */
    @Check(paramValues = {"man", "woman"})
    private String sex;
}
