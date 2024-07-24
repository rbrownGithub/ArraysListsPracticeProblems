package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    private ArrayList<String> items;

    public HowLarge() {
        items = new ArrayList<>();
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a string (or press Enter to finish): ");
            String item = scanner.nextLine();
            if (item.isEmpty()) {
                break;
            }
            items.add(item);
        }
    }

    public void printSize() {
        System.out.println("The total amount of items in the list was: " + items.size());
    }

    public static void main(String[] args) {
        HowLarge howLarge = new HowLarge();
        howLarge.getInput();
        howLarge.printSize();
    }
}