package com.tedu.comsumer.service;


import com.tedu.comsumer.entity.User;
import com.tedu.comsumer.util.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;



@FeignClient(name = "SPRINGCLOUD-PROVIDER")
public interface ZktestClient {
    @RequestMapping("/test")
    String test();

    @RequestMapping(value = "/reg",produces = {"application/json;charset=UTF-8"})
    JsonResult<Void> reg(User user);



}
