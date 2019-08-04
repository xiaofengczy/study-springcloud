package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * FileName: ServerOrderApplication Description:
 *
 * @author caozhongyu
 * @create 19-8-3
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
@RefreshScope
public class OrderServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(OrderServerApplication.class, args);
  }
}