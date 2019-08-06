package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * FileName: RibboApplication Description:
 *
 * @author caozhongyu
 * @create 19-8-6
 */
@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClient(name ="client-a",configuration = TestConfiguration.class)
public class RibbonServerApplication {

  public static void main(String[] args){
    SpringApplication.run(RibbonServerApplication.class, args);
  }

  @LoadBalanced
  @Bean
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }

}