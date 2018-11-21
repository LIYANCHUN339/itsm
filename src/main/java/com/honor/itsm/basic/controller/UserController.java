package com.honor.itsm.basic.controller;

import com.alibaba.fastjson.JSON;
import com.honor.itsm.basic.dto.UserDto;
import com.honor.itsm.basic.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取当前用户信息" ,notes = "要链接数据库进行升级了")
    @ResponseBody
    @RequestMapping("/currentUser")
    private String getCurrentUser(){
        String userid="00000001";
        UserDto userDto= userService.getCurrentUser(userid);
        return JSON.toJSONString(userDto);
    }
}
