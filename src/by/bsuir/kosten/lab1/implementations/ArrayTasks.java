package by.bsuir.kosten.lab1.implementations;

public class ArrayTasks {
    static public void printPrimalElements(int[] array) {
        boolean isPrimal;
        for (int i = 0; i < array.length; i++) {
            isPrimal = true;
            for (int j = 2; j <= Math.sqrt(array[i]); j++) {
                if(array[i]%j==0) {
                    isPrimal=false;
                    break;
                }
            }

            if(isPrimal){
                if(i != 0) System.out.print(", ");
                System.out.print(i);
            }
        }
        System.out.println();
    }

    static public int getMinNotGrownElements(int[] array) {
        int countNotGrowElements, minCountNotGrowElements = array.length, offset;
        for (int i = 0; i < array.length-1; i++) {
            countNotGrowElements = i;
            offset = 0;
            for (int j = i+1; j < array.length; j++) {
                if(array[j-1-offset]>array[j]) {
                    offset++;
                    countNotGrowElements++;
                }
                else offset = 0;
            }
            if(countNotGrowElements<minCountNotGrowElements)
                minCountNotGrowElements = countNotGrowElements;
        }
        return minCountNotGrowElements;
    }

    static public double[][] getNMatrix(double[] array) {
        double[][] matrix = new double[array.length][array.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = array[(j+i)%array.length];
            }
        }
        return matrix;
    }

    static public void shellSort(double[] array) {
        int i = 0;
        while (i<array.length-1) {
            if(array[i]<=array[i+1]) i++;
            else {
                double swapElement = array[i];
                array[i] = array[i+1];
                array[i+1] = swapElement;
                i--;
                if(i < 0) i=0;
            }
        }
    }

    static public int[] mergeArrays(double[] a, double[] b) {
        int[] placesToAddElements = new int[b.length];
        int j = 0, place = 0;
        for (int i = 0; i < a.length; i++, place++) {
            while(b[j] <= a[i]) {
                placesToAddElements[j++] = place++;
                if(j>=placesToAddElements.length) return placesToAddElements;
            }
        }
        for (int i = j; i < placesToAddElements.length; i++, place++) {
            placesToAddElements[i] = place;
        }
        return placesToAddElements;
    }
}
