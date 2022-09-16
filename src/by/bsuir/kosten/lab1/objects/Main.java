package by.bsuir.kosten.lab1.objects;

import by.bsuir.kosten.lab1.implementations.ArrayTasks;
import by.bsuir.kosten.lab1.implementations.MathTasks;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1: f(5, 5) = " + MathTasks.firstTask(5, 5));
        System.out.println("task 2: f(3, 5) = " + MathTasks.secondTask(3, 5));
        System.out.println("task 3: tg([0, 5] h=1) = " + MathTasks.thirdTask(0, 5, 1));

        int[] arr = new int[]{1, 2, 3, 4, 13, 1257, 12, 1543};

        System.out.println("int array: ");
        for (int k : arr) {
            System.out.print(k + ", ");
        }
        System.out.println();

        System.out.println("task 5: ");
        ArrayTasks.printPrimalElements(arr);
        System.out.println("task 6: " + ArrayTasks.getMinNotGrownElements(arr));
        double[] dArr = new double[]{1.2, 4.3, 1.4, 0.1, 2.6, 9.1, 5.2};

        System.out.println("double array: ");
        for (double v : dArr) {
            System.out.print(v + ", ");
        }
        System.out.println();

        System.out.println("task 7: ");
        double[][] matrix = ArrayTasks.getNMatrix(dArr);
        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + ", ");
            }
            System.out.println();
        }

        System.out.println("task 8: ");
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

        System.out.println("task 9: ");
        int[] mergeArr = ArrayTasks.mergeArrays(dArr, secondDArr);
        for (int j : mergeArr) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }
}