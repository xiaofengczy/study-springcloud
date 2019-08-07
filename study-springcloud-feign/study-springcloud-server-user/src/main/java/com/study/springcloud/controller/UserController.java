package com.study.springcloud.controller;

import com.study.springcloud.user.api.BookApi;
import com.study.springcloud.user.api.UserApi;
import com.study.springcloud.user.entity.Book;
import com.study.springcloud.user.entity.Params;
import com.study.springcloud.user.entity.User;
import java.util.Objects;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: UserController Description:
 *
 * @author caozhongyu
 * @create 19-8-3
 */
@RestController
public class UserController implements BookApi,UserApi{

  @Override
  public User findUserById(String userId) {
    User user = new User();
    if(Objects.equals(userId, "1")){
      user.setUserId(userId);
      user.setUserName("张三");
      user.setPhone("13256847852");
      user.setAddress("上海市嘉定区111");
      return user;
    }
    user.setUserId(userId);
    user.setUserName("李四");
    user.setPhone("123423433223");
    user.setAddress("重庆市渝北区111");
    return user;
  }

  @Override
  public String demoEndPoint(Params params) {
    return params.toString();
  }


  @Override
  public Book getBook(String bookId) {
    Book book = new Book();
    book.setBookName("三国演义");
    book.setId(bookId);
    return book;
  }
}