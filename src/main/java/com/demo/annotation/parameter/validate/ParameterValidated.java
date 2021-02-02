package com.demo.annotation.parameter.validate;

import com.demo.annotation.parameter.Check;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

/**
 *  验证注解
 * @Date:2020/2/1 21:21
 */
public class ParameterValidated implements ConstraintValidator<Check, Object> {
    /**
     * 合法的参数值，从注解中获取
     */
    private List<String> values;

    @Override
    public void initialize(Check check) {
        //初始化时获取注解上的值
        values = Arrays.asList(check.paramValues());
    }

    @Override
    public boolean isValid(Object parameter, ConstraintValidatorContext constraintValidatorContext) {
        if (values.contains(parameter)) {
            return true;
        }

        //不在指定的参数列表中
        return false;
    }
}
