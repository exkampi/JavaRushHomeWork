package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strArray = new String[10];

        for (int i = 0; i < strArray.length - 2; i++) {
            strArray[i] = reader.readLine();
        }



        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[strArray.length - i - 1]);
        }
    }
}