package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
           String greetings[] = {"안녕하세요", "hello", "Good morning", "반갑습니다."};

        Arrays.stream(greetings).reduce("", (s1, s2) ->
        {if(s1.getBytes().length >= s2.getBytes().length) return s1;
                else return s2;}
        );
    }
}