package by.bsuir.kosten.lab1.objects;

import by.bsuir.kosten.lab1.implementations.MathTasks;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1: f(5, 5) = " + MathTasks.firstTask(5, 5));
        System.out.println("task 2: f(3, 5) = " + MathTasks.secondTask(3, 5));
        System.out.println("task 3: tg([0, 5] h=1) = " + MathTasks.thirdTask(0, 5, 1));


    }
}