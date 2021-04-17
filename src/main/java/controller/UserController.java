package controller;


import beans.User;
import dto.BasicRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.user.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService user;


    @RequestMapping("/one")
    @ResponseBody
    public User getOneUser(@RequestBody BasicRequestDto request) {
       return  user.getOneUser(request);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<User> getListUser(@RequestBody User request) {
        return  user.getListUser(request);
    }

    @RequestMapping("/update")
    @ResponseBody
    public User updateOneUser(@RequestBody BasicRequestDto request) {
        return  user.getOneUser(request);
    }
}
