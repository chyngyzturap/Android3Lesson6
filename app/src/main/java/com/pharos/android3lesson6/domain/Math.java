package com.pharos.android3lesson6.domain;

import java.util.List;

public class Math {
    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public int mul(int a, int b){
        return a*b;
    }

    public int div(int a, int b){
        return a/b;
    }

    public String reverseWords(String str){

        String[] words = str.split(" ");
        StringBuilder builder = new StringBuilder();
        builder.append(words[1]);
        builder.append(" ");
        builder.append(words[0]);
        return builder.toString();
    }
}
