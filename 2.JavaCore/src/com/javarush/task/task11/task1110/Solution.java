package com.javarush.task.task11.task1110;

/* 
Не забываем инкапсулировать
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;
        private int speed;

        private Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;

        }

        private String getName() {
            return name;
        }

        private int getAge() {
            return age;
        }

        private void setWeight(int weight) {
            this.weight = weight;

        }

        private void setSpeed(int speed) {
            this.speed = speed;

        }
    }
}
