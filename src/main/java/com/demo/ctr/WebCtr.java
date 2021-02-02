package com.demo.ctr;

import com.demo.annotation.cache.CustomCache;
import com.demo.annotation.permission.PermissionCheck;
import com.demo.vo.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebCtr {

    //测试自定义注解实现参数校验
    @PostMapping("/api/test")
    public User test(@Validated @RequestBody User user) {
        return user;
    }

    //测试自定义注解实现权限拦截
    @GetMapping("/api/permission")
    @PermissionCheck(resourceKey = "test")
    public String testPermissionCheck() {
        return "success";
    }

    //测试自定义注解实现缓存
    @GetMapping("/api/cache")
    @CustomCache(key = "test")
    public String testCustomCache() {
        return "data from database";
    }

}
