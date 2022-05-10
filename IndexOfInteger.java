import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        ArrayList <Integer> item = new ArrayList<>();

        System.out.println("Please enter a number: ");

        while(true) {
            Integer number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Done entering integers into the list");
            System.out.println("What number are you looking for in the list?");
            int number2 = scanner.nextInt();
            System.out.println(number2 + " is at the index " + item.indexOf(number2));
            break;
        } else {
            item.add(number);
        } 
        continue;
        }
        scanner.close();
}
}
