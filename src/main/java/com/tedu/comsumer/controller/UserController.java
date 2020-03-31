package com.tedu.comsumer.controller;

import com.tedu.comsumer.entity.User;
import com.tedu.comsumer.service.ZktestClient;
import com.tedu.comsumer.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public static final Integer OK = 2000;
    //http://localhost:9002/test


    @Autowired
    private ZktestClient zktestClient;
    // http://localhost:9002/demo?username=occl&password=1234&gender=0&phone=13100131001&email=controller@qq.com

    @PostMapping("/demo")
    public JsonResult<Void> reg(User user) {
        zktestClient.reg(user);
        System.err.println(user);
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(OK);
        jsonResult.setMessage("注册成功！");
        return jsonResult;
    }
}