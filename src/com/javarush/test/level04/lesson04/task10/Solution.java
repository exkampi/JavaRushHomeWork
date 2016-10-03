package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sNum1 = bufferedReader.readLine();
        String sNum2 = bufferedReader.readLine();
        String sNum3 = bufferedReader.readLine();
        int dNum1 = Integer.parseInt(sNum1);
        int dNum2 = Integer.parseInt(sNum2);
        int dNum3 = Integer.parseInt(sNum3);

        String equally = "";

        if (dNum1 == dNum2) {
            equally = dNum1 + " " + dNum2;

            if (dNum1 == dNum3) {
                equally += " " + dNum3;
            }

        } else if (dNum2 == dNum3) {
            equally = dNum2 + " " + dNum3;

            if (dNum2 == dNum1) {
                equally = dNum1 + " " + dNum2 + " " + dNum3;
            }

        } else if (dNum1 == dNum3) {
            equally = dNum1 + " " + dNum3;

            if (dNum1 == dNum2) {
                equally = dNum1 + " " + dNum2 + " " + dNum3;
            }
        }

        System.out.println(equally);

    }
}