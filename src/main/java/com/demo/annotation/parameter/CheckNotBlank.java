package com.demo.annotation.parameter;


import com.demo.annotation.parameter.validate.CheckNotBlankValidated;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 参数校验注解
 */
@Target({ElementType.FIELD}) //只允许用在类的属性上
@Retention(RetentionPolicy.RUNTIME) //注解保留在程序运行期间，此时可以通过反射获得定义在某个类上的所有注解
@Constraint(validatedBy = CheckNotBlankValidated.class)
public @interface CheckNotBlank {

    /**
     * 提示信息
     */
    String message() default "不能为空";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
