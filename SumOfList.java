import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        ArrayList <Integer> list = new ArrayList<>();

        System.out.println("Please enter a number: ");

        while(true) {
            Integer number = scanner.nextInt();

        if (number == 0) {
            break;
        } else {
            list.add(number);
        } continue;
    }
        int sum = 0;
        for (int i = 0; i < list.size(); i ++){

            sum = sum + list.get(i); 
            System.out.println(list + " were the items in the list. The sum of that list is:  " + sum);
    }

    scanner.close();
}
}
