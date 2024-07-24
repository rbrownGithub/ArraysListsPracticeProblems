package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    private ArrayList<String> items;

    public LastItem() {
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

    public void printLastItem() {
        if (!items.isEmpty()) {
            System.out.println("The last item in the list is: " + items.get(items.size() - 1));
        } else {
            System.out.println("The list is empty.");
        }
    }

    public static void main(String[] args) {
        LastItem lastItem = new LastItem();
        lastItem.getInput();
        lastItem.printLastItem();
    }
}
