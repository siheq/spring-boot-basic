package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {

    @RequestMapping(path = "/{n}", method = RequestMethod.GET)
    public int fibonacci(@PathVariable int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
