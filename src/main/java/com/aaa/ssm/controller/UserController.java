package com.aaa.ssm.controller;/**
 * Created by${smy}
 */

import com.aaa.ssm.service.UserService;
import com.aaa.ssm.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
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
<<<<<<< Updated upstream
    //sou
=======
>>>>>>> Stashed changes
    @Autowired
    private UserService service;
    @ResponseBody
    @RequestMapping("/list")
    public Object list(){
        return service.getUserList();
    }

    @RequestMapping("/listPage")
    public String listPage(@RequestParam Map map, HttpServletRequest request, Model model){
        //  Map map  = new HashMap();
        map.put("pageNo",map.get("pageNo")==null?1:map.get("pageNo"));
        map.put("pageSize",3);
        //获取分页 数据
        List<Map> userPage =service.getUserPage(map);
        model.addAttribute("userPage",userPage);
        //获取总条数
        int total = service.getUserPageCount(map);
        //使用分页工具类
        //(int pageNo,int pageSize,int total,HttpServletRequest request)
        String pageString = new PageUtil(Integer.valueOf(map.get("pageNo")+""), Integer.valueOf(map.get("pageSize")+""), total, request).getPageString();
        model.addAttribute("pageString",pageString);
        model.addAttribute("map",map);
        return "user/listpage";
    }
}
