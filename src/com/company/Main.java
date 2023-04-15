package com.company;

import java.util.Arrays;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        int[][] tall = {
                {173,169,176,182},
                {170,171,175,172},
                {180,168,167,173}
        };
        StringJoiner sj = new StringJoiner(",");
        StringJoiner s1 = new StringJoiner(",");
        StringJoiner s2 = new StringJoiner(",");

        Arrays.stream(tall[0]).forEach(i -> sj.add(String.valueOf(i)));
        Arrays.stream(tall[1]).forEach(i -> s1.add(String.valueOf(i)));
        Arrays.stream(tall[2]).forEach(i -> s2.add(String.valueOf(i)));
        System.out.println(sj.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
