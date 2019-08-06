package com.study.springcloud.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: TestController Description:
 *
 * @author caozhongyu
 * @create 19-8-6
 */
@RestController
public class TestController {

  @GetMapping("/add")
  public String add(Integer a,Integer b, HttpServletRequest request){
    return "From Port: "+ request.getServerPort()+",Result = "+(a+b);
  }
}