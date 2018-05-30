package com.example.demo.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fibonacci")
public class FizzBuzzController {

    @RequestMapping(path = "/{number}", method = RequestMethod.GET)
    public String getFizzBuzz (@PathVariable int number) {
        if (number == 1) {
            return String.valueOf(1);
        }
        return "";
    }
}
