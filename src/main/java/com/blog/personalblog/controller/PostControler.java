package com.blog.personalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.personalblog.service.PostService;


@Controller
@RequestMapping("/post")
public class PostControler {

    @Autowired 
    private PostService postService;

    @GetMapping("/home")
    public String homePage(Model model){

            model.addAttribute("post",postService.getAllPost());
        return "/posts/home";
    }

}
