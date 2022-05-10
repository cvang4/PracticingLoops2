import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        ArrayList <String> large = new ArrayList<>();

        System.out.println("Enter strings: ");

        while (true){
        String string = scanner.nextLine();
        if (string.equals("")){
            break;
        } else {
            large.add(string);
        } continue;
        }

        for (int i = 0; i < large.size(); i++) {
            System.out.println(large.get(i));
            
        }
        System.out.println("The total amount of items in the list was: " + large.size());
        scanner.close();
    }
    }
