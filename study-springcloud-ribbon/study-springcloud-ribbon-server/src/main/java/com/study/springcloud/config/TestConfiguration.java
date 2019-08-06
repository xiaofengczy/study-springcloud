package com.study.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.study.springcloud.annotion.AvoidScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FileName: TestConfiguration Description:
 *
 * @author caozhongyu
 * @create 19-8-6
 */
//@Configuration
//@AvoidScan
public class TestConfiguration {
  @Bean
  public IRule ribbonRule() {
    return new RandomRule();
  }
}