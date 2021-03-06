package com.javarush.task.task09.task0923;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "", str2 = "";

        String str = reader.readLine();

        char[] mas = str.toCharArray();

        for (int i = 0; i < mas.length; i++) {
            if (isVowel(mas[i]))  str1 += mas[i] + " ";
            else if (mas[i] != ' ') str2 += mas[i] + " ";
        }
        System.out.println(str1);
        System.out.println(str2);


    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}