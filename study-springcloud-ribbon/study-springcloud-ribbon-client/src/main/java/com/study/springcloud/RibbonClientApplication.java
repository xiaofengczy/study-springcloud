package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * FileName: RibbonClientApplication Description:
 *
 * @author caozhongyu
 * @create 19-8-6
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(RibbonClientApplication.class, args);
  }

}