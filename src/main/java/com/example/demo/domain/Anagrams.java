package com.example.demo.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static List<String> of(String s) {
        char[] cs = s.toCharArray();
        ArrayList<String> result = new ArrayList<>();
        if (cs.length == 1)
            result.add(String.valueOf(cs[0]));
        else if (cs.length >= 2) {
            for (int i = 0; i < s.length(); i++) {
                String curTmp = drop(s, i);
                for (int j = 0; j < of(curTmp).size(); j++) {
                    result.add(s.charAt(i) + of(curTmp).get(j));
                }
            }
        }
        return result;
    }

    private static String drop(String input, int idx) {
        return new StringBuffer(input).deleteCharAt(idx).toString();
    }

}
