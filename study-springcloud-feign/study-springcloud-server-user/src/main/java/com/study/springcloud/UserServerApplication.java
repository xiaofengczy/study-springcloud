package com.study.springcloud;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;

/**
 * FileName: SpringcloudServerApplication Description:
 *
 * @author caozhongyu
 * @create 19-8-3
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class UserServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(UserServerApplication.class);
  }

//  @Bean
//  Logger.Level feignLoggerLevel() {
//    return Logger.Level.FULL;
//  }
}