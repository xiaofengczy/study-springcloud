package com.study.springcloud.controller;

import com.study.springcloud.entity.Order;
import com.study.springcloud.user.api.BookApi;
import com.study.springcloud.user.api.UserApi;
import com.study.springcloud.user.entity.Book;
import com.study.springcloud.user.entity.Params;
import com.study.springcloud.user.entity.User;
import java.util.Objects;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: OrderController Description:
 *
 * @author caozhongyu
 * @create 19-8-3
 */
@RestController
@RequestMapping("/order")
public class OrderController {

  @Resource
  private UserApi userApi;

  @Resource
  private BookApi bookApi;

  @GetMapping("/find/{orderNo}")
  Order findOrderByNo(@PathVariable("orderNo") String orderNo) {
    Order order = new Order();
    order.setOrderNo(orderNo);
    if (Objects.equals(orderNo, "1")) {
      order.setUserId("1");
      order.setNum(1);
      User user = userApi.findUserById(order.getUserId());
      order.setUser(user);
      return order;
    }
    order.setUserId("2");
    order.setNum(23);
    User user = userApi.findUserById(order.getUserId());
    order.setUser(user);
    return order;
  }

  @PostMapping("/demo")
  String findDemo(@RequestBody Params params) {
    String s = userApi.demoEndPoint(params);
    return s;
  }

  @GetMapping("/book/{id}")
  Book findBook(@PathVariable("id") String id) {
    return bookApi.getBook(id);
  }
}