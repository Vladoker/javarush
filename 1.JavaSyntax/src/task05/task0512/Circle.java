package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
*/

public class Circle {
    int centerX;
    int centerY;
    int radius;
    int width;
    int color;

    public void initialize(int centerX,int centerY,int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = 0;
        this.color = 0;
    }
    public void initialize(int centerX,int centerY,int radius,int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = 0;
    }
    public void initialize(int centerX,int centerY,int radius,int width,int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
