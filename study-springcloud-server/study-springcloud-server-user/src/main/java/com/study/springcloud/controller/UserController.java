package com.study.springcloud.controller;

import com.study.springcloud.api.UserApi;
import com.study.springcloud.entity.User;
import java.util.Objects;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: UserController Description:
 *
 * @author caozhongyu
 * @create 19-8-3
 */
@RestController
public class UserController implements UserApi {

  @Override
  public User findUserById(String userId) {
    User user = new User();
    if(Objects.equals(userId, "1")){
      user.setUserId(userId);
      user.setUserName("张三");
      user.setPhone("13256847852");
      user.setAddress("上海市嘉定区");
      return user;
    }
    user.setUserId(userId);
    user.setUserName("李四");
    user.setPhone("123423433223");
    user.setAddress("重庆市渝北区");
    return user;
  }
}