package com.example.springboottrainproject.controller;

import com.example.springboottrainproject.model.User;
import com.example.springboottrainproject.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserRepo repo;
    @RequestMapping("index")
    public String newMethod(){
        return "index.jsp";
    }
    @RequestMapping("adduser")
    public String adduser(User user){
        repo.save(user);
        return "index.jsp";
    }
}
