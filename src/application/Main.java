package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the size of the array");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Please enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Please enter the expected sum: ");
        int expectedSum = scanner.nextInt();

        boolean success = false;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == expectedSum) {
                    System.out.println("the expected sum are equal to elements with index: "
                            + i + " and index: " + j);
                    success = true;
                    break;
                }
            }
        }
        if(!success)
            System.out.println("unfortunately there is no two elements in the array that equal the required sum");

    }
}
