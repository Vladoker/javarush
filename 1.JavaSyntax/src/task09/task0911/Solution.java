package com.javarush.task.task09.task0911;

import com.sun.jndi.cosnaming.ExceptionMapper;

import java.util.HashMap;

/* 
Исключение при работе с коллекциями Map
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }
        catch (NullPointerException ex)
        {
            System.out.println(ex);
        }

        //напишите тут ваш код
    }
}
