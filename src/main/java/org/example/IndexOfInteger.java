import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    private ArrayList<Integer> numbers;

    public IndexOfInteger() {
        numbers = new ArrayList<>();
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer (or 0 to finish): ");
            try {
                int num = Integer.parseInt(scanner.nextLine());
                if (num == 0) {
                    System.out.println("Done entering integers into the list");
                    break;
                }
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    public void findIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number are you looking for in the list? ");
        try {
            int searchNum = Integer.parseInt(scanner.nextLine());
            boolean found = false;
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == searchNum) {
                    System.out.println(searchNum + " is at index " + i);
                    found = true;
                }
            }
            if (!found) {
                System.out.println(searchNum + " is not in the list");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }

    public static void main(String[] args) {
        IndexOfInteger indexOfInteger = new IndexOfInteger();
        indexOfInteger.getInput();
        indexOfInteger.findIndex();
    }
}