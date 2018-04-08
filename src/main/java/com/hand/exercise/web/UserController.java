package com.hand.exercise.web;

import com.hand.exercise.domain.User;
import com.hand.exercise.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guoqiang.lv@hand-china.com
 * @version 1.0
 * @date 2018/3/28
 */
@RestController
@Api(description = "用户基本信息api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return userService.selectById(id);
    }
}
