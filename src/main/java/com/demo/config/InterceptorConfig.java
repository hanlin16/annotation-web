package com.demo.config;

import com.demo.annotation.permission.interceptor.PermissionCheckInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *  拦截器配置类
 *
 *
 * @Date:2019/6/2 9:23 
 *
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //权限验证拦截
        registry.addInterceptor(new PermissionCheckInterceptor()).addPathPatterns("/api/permission");

        super.addInterceptors(registry);
    }
}
