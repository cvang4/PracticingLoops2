import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        ArrayList <String> item = new ArrayList<>();

        System.out.println("Enter strings: ");

        while (true){
        String string = scanner.nextLine();
        if (string.equals("")){
            break;
        } else {
            item.add(string);
        } continue;
        }

        for (int i = 0; i < item.size(); i++) {
            System.out.println(item.get(i));
            
        }
        System.out.println("The last item in the list is: " + item.get(item.size() -1));
        scanner.close();
    }
}
