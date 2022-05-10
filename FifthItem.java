import java.util.Scanner;
import java.util.ArrayList;

public class FifthItem {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        ArrayList <String> fifth = new ArrayList<>();

        System.out.println("Enter strings: ");

        while (true){
        String string = scanner.nextLine();
        if(string.equals("")){
            break;
        } else {
            fifth.add(string);
        } continue;
        }

        for (int i = 0; i < fifth.size(); i++) {
            System.out.println(fifth.get(i));
            
        }
        System.out.println("The fifth item in the list is: " + fifth.get(4));
        scanner.close();
    }
    }
