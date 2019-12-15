package diana.stelmakh;

import java.util.Arrays;
import java.util.Comparator;

class Matrix {

    private void printMatrix(Integer[][] matrix, String text){
        System.out.println("---------------------------");
        System.out.println();
        System.out.println(text);
        System.out.println("---------------------------");
        for (Integer[] matrix1 : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%6d", matrix1[j]);
            }
            System.out.println();
        }
    }

    double getAverage(Integer[][] matrix){
        double average = 0;

        for (Integer[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                average += ints[j];
            }
        }

        average /= matrix.length * matrix.length;
        System.out.println();
        System.out.println("Среднее арифметическое = " + average);
        System.out.println();
        return average;
    }

    Integer[][] sortMatrixDescending(Integer[][] matrix){
        for(Integer[] element : matrix){
            Arrays.sort(element, new Comparator<Integer>(){
                public int compare(Integer o1, Integer o2) {
                    if(o1 < o2) return 1;
                    if(o1 > o2) return -1;
                    return 0;
                }
            });
        }
        printMatrix(matrix, "Отсортированная по убыванию матрица");
        return matrix;
    }

    Integer[][] sortMatrixAscending(Integer[][] matrix){
        for(Integer[] element : matrix){
            Arrays.sort(element);
        }
        printMatrix(matrix, "Отсортированная по возрастанию матрица");
        return matrix;
    }

    Integer[][] doTheTask(Integer[][] matrix){
        printMatrix(matrix, "Исходная матрица");
        if(matrix[matrix.length / 2][matrix.length / 2] <= getAverage(matrix)){
            matrix = sortMatrixAscending(matrix);
        }else{
            matrix = sortMatrixDescending(matrix);
        }


        return matrix;
    }
}
