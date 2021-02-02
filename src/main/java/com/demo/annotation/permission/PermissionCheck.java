package com.demo.annotation.permission;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  权限校验注解
 * @Date:2019/06/02 09:07
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PermissionCheck {
    /**
     * 资源key
     */
    String resourceKey();
}
