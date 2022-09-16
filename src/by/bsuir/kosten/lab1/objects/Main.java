package by.bsuir.kosten.lab1.objects;

import by.bsuir.kosten.lab1.implementations.ArrayTasks;
import by.bsuir.kosten.lab1.implementations.MathTasks;
import by.bsuir.kosten.lab1.objects.Color;
import by.bsuir.kosten.lab1.objects.Ball;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("task 1: f(5, 5) = " + MathTasks.firstTask(5, 5));
        System.out.println("task 2: f(3, 5) = " + MathTasks.secondTask(3, 5));
        System.out.println("task 3: tg([0, 5] h=1) = " + MathTasks.thirdTask(0, 5, 1));

        int[] arr = new int[]{1, 2, 3, 4, 13, 1257, 12, 1543};

        System.out.println("int array: ");
        for (int k : arr) {
            System.out.print(k + ", ");
        }
        System.out.println();

        System.out.println("task 4: ");
        ArrayTasks.printPrimalElements(arr);
        System.out.println("task 5: " + ArrayTasks.getMinNotGrownElements(arr));
        double[] dArr = new double[]{1.2, 4.3, 1.4, 0.1, 2.6, 9.1, 5.2};

        System.out.println("double array: ");
        for (double v : dArr) {
            System.out.print(v + ", ");
        }
        System.out.println();

        System.out.println("task 6: ");
        double[][] matrix = ArrayTasks.getNMatrix(dArr);
        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + ", ");
            }
            System.out.println();
        }

        System.out.println("task 7: ");
        ArrayTasks.shellSort(dArr);
        for (double v : dArr) {
            System.out.print(v + ", ");
        }
        System.out.println();

        double[] secondDArr = new double[]{3.2, 2.4, 3.5, 2.5, 9.1, 2.8, 5.6};
        ArrayTasks.shellSort(secondDArr);
        System.out.println("second double array: ");
        for (double v : secondDArr) {
            System.out.print(v + ", ");
        }
        System.out.println();

        System.out.println("task 8: ");
        int[] mergeArr = ArrayTasks.mergeArrays(dArr, secondDArr);
        for (int j : mergeArr) {
            System.out.print(j + ", ");
        }
        System.out.println();

        System.out.println("task 9:");
        Basket bask = new Basket(new ArrayList());
        bask.balls.add(new Ball(Color.RED, 1));
        bask.balls.add(new Ball(Color.BLUE, 2));
        bask.balls.add(new Ball(Color.RED, 3));
        bask.balls.add(new Ball(Color.GREEN, 4));
        bask.balls.add(new Ball(Color.BLUE, 5));
        bask.balls.add(new Ball(Color.GREEN, 6));
        bask.balls.add(new Ball(Color.BLUE, 7));
        System.out.println("Weight of balls = " + bask.getBallsWeight());
        System.out.println("Blue balls' count = " + bask.getBlueBallsCount());

        System.in.read();
    }
}