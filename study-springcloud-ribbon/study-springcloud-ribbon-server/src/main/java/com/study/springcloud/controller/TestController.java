package com.study.springcloud.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * FileName: TestController Description:
 *
 * @author caozhongyu
 * @create 19-8-6
 */
@RestController
public class TestController {

  @Resource
  private RestTemplate restTemplate;

  @GetMapping("/add")
  public String add(Integer a, Integer b) {
    String result = restTemplate.getForObject("http://client-a/add?a=" + a + "&b=" + b, String.class);
    System.out.println(result);
    return result;
  }
}