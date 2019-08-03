package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * FileName: SpringcloudEurekaApplication Description:
 *
 * @author caozhongyu
 * @create 19-8-3
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringcloudEurekaApplication.class, args);
  }


}