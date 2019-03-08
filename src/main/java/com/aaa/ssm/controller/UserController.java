package com.aaa.ssm.controller;/**
 * Created by${smy}
 */

import com.aaa.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 *fileName:UserController
 *description:
 *author:Smy
 *createTime:2019/3/3 0003 10:58
 */
@Controller
@RequestMapping("/user")
public class UserController {
    //asfaaa
    @Autowired
    private UserService service;
    @ResponseBody
    @RequestMapping("/list")
    public Object list(){
        return service.getUserList();
    }
}
