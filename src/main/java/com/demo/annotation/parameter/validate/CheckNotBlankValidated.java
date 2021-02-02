package com.demo.annotation.parameter.validate;

import com.demo.annotation.parameter.CheckNotBlank;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

/**
 * 验证注解
 */
public class CheckNotBlankValidated implements ConstraintValidator<CheckNotBlank, Object> {
    /**
     * 合法的参数值，从注解中获取
     */
    private String value;

    @Override
    public void initialize(CheckNotBlank checkValues) {

    }

    @Override
    public boolean isValid(Object parameter, ConstraintValidatorContext constraintValidatorContext) {
        if (!StringUtils.isEmpty(parameter)) {
            return true;
        }

        return false;
    }
}
