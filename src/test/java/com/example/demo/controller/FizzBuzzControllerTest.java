package com.example.demo.controller;

import org.junit.Test;
import org.springframework.util.Assert;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzControllerTest {

    @Test
    public void get_1_when_getFizzBuzz_given_index_1() {
        FizzBuzzController controller = new FizzBuzzController();
        String result = controller.getFizzBuzz(1);
        assertThat(result).isEqualTo("1");
    }

}
