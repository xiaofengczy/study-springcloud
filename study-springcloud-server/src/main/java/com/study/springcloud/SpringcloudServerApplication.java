package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * FileName: SpringcloudServerApplication Description:
 *
 * @author caozhongyu
 * @create 19-8-3
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringcloudServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringcloudServerApplication.class);
  }
}