package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы

    public static void print(int x) {
        System.out.println(x);
    }

    public static void print(String x) {
        System.out.println(x);
    }

    public static void print(byte x) {
        System.out.println(x);
    }
    public static void print(short x) {
        System.out.println(x);
    }

    public static void print(int x, String name) {
        System.out.println(x + ": " + name);
    }
}
