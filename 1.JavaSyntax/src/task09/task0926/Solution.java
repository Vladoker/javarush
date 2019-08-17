package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
       ArrayList<int[]> list = new ArrayList<>(5);
       int[] mas1 = new int[5];
       int[] mas2 = new int[2];
       int[] mas3 = new int[4];
       int[] mas4 = new int[7];
       int[] mas5 = new int[0];

       list.add(mas1);
       list.add(mas2);
       list.add(mas3);
       list.add(mas4);
       list.add(mas5);

       return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
