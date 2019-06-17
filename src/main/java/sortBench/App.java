package sortBench;

import java.util.Scanner;

import sortBench.algorithm.*;

public class App {
    
  
    private static void swapNumbers(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    // End buuble sort method

    public static void main(String[] args) {
        // Handle user input
        System.out.print("Choose an algorithm to test: ");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        // TODO replace that line by user input handling
        System.out.println(userInput);

        // TODO add system to choose the algorithm to bench

        // Default data set for benchmark
        int[] data = {5,4,5,2,7,19,0};

        executeBench(new Default(), data);

        // TODO Display time execution 
    }

    private static void executeBench(ISortingAlgorithm algo, int[] dataSet) {
        //Execute algorithm against benchmark
        bubbleSort(dataSet);

        // Print sorted array
        printNumbers(dataSet);
    }

    private static void printNumbers(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            if(i < input.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }
}
