package com.example.demo.domain;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramsTest {

    @Test
    public void should_return_empty_list_given_empty_string () {
        List<String> result = Anagrams.of("");
        assertThat(result.size()).isEqualTo(0);
    }

    @Test
    public void should_return_anagrams_list_given_size_1_string () {
        List<String> result = Anagrams.of("a");
        assertThat(result.get(0)).isEqualTo("a");
    }

    @Test
    public void should_return_anagrams_list_given_size_2_string () {
        List<String> result = Anagrams.of("ab");
        assertThat(result.contains("ab")).isTrue();
        assertThat(result.contains("ba")).isTrue();
    }

    @Test
    public void should_return_anagrams_list_given_size_3_string () {
        List<String> result = Anagrams.of("abc");
        List<String> expect = Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
        assertThat(result).isEqualTo(expect);
    }

    @Test
    public void should_return_anagrams_list_given_size_4_string () {
        List<String> result = Anagrams.of("abcd");
        List<String> expect = Arrays.asList("abcd", "abdc", "acbd", "acdb", "adbc", "adcb",
                "bacd", "badc", "bcad", "bcda", "bdac", "bdca",
                "cabd", "cadb", "cbad", "cbda", "cdab", "cdba",
                "dabc", "dacb", "dbac", "dbca", "dcab", "dcba");
        assertThat(result).isEqualTo(expect);
    }
}
