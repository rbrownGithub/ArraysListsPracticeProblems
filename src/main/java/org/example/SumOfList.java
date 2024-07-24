package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    private ArrayList<Integer> numbers;

    public SumOfList() {
        numbers = new ArrayList<>();
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer (or 0 to finish): ");
            try {
                int num = Integer.parseInt(scanner.nextLine());
                if (num == 0) {
                    break;
                }
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    public int calculateSum() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfList sumOfList = new SumOfList();
        sumOfList.getInput();
        int totalSum = sumOfList.calculateSum();
        System.out.println("The sum of the numbers: " + totalSum);
    }
}