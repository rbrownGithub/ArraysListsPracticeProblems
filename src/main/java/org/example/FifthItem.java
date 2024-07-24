package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {

    private ArrayList<String> items;

    public FifthItem() {
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
    public void printFifthItem() {
        if (items.size() >= 5) {
            System.out.println("The fifth item in the list is: " + items.get(4));
        } else {
            System.out.println("The list doesn't have a fifth item.");
        }
    }
    public static void main(String[] args) {
        FifthItem fifthItem = new FifthItem();
        fifthItem.getInput();
        fifthItem.printFifthItem();
    }
}
