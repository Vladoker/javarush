package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    double t = Double.parseDouble(reader.readLine());

    while(t>=5) t=t-5;

    if(t<3 && t>=0) System.out.println("зелёный");
    else if(t<4 && t>=3) System.out.println("жёлтый");
    else if(t<5 && t>=4) System.out.println("красный");


    }
}