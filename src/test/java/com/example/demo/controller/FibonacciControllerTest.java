package com.example.demo.controller;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciControllerTest {

    @Test
    public void shouldReturnFibonacci () {
        FibonacciController tmp = new FibonacciController();
        int result = tmp.fibonacci(3);
        assertThat(result).isEqualTo(2);
    }
}
