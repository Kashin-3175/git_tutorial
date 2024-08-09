package com.example.todo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")

public class IndexController {

    @GetMapping
    public String index() {
//        var task = new TaskDTO(
//                1L,
//                "Spring",
//                "todo",
//                "OPEN"
//        );
        return "index";
    }
}
