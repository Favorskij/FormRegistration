package com.formregistration.controller;

import com.formregistration.model.User;
import com.formregistration.repository.Repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


    @Autowired
    public Repositories repositories;

    @GetMapping(value = "/signup")
    public String registrationform () {
        return "/register";
    }

    @PostMapping("/user/register")
    public ModelAndView gisterUser(@ModelAttribute("user") User user){
        repositories.addSave(user);
        return new ModelAndView("redirect:/login");
    }

    @GetMapping("/")
    public String home () {
        return "/home";
    }

    @GetMapping("/user")
    public String user () {
        return "/user";
    }

    @GetMapping("/admin")
    public String admin () {
        return "/admin";
    }

    @GetMapping("/login")
    public String login () {
        return "/login";
    }

    @GetMapping("/supervisor")
    public String supervisor () {
        return "/supervisor";
    }
}
