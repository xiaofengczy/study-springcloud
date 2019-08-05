package com.study.springcloud.entity;

import lombok.Data;

/**
 * FileName: Order Description:
 *
 * @author caozhongyu
 * @create 19-8-3
 */
@Data
public class Order {
  /**订单号*/
  private String orderNo;

  /**订单数量*/
  private Integer num;

  /**用户id*/
  private String userId;

  /**用户*/
  private User user;
}