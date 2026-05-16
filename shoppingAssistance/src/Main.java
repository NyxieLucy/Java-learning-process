import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("how many stuff you plan to buy?: ");
        int amount = scanner.nextInt();
        List<String> itemList = new ArrayList<>();

        double price = 0;
        int quantity = 0;
        double total = 0;

        for (int i = 1; i <= amount; i++) {

            System.out.print("item number " + i + " you wanna buy?: ");
            String item = scanner.next();
            itemList.add(item);

            System.out.print("how much is that?: ");
            price = scanner.nextDouble();
            itemList.add(String.valueOf("price: " + price + " DH"));

            System.out.print("how many you wanna buy?: ");
            quantity = scanner.nextInt();
            itemList.add(String.valueOf("quantity: " +quantity));
            double total1 = price * quantity;
            total += total1;




        }
        System.out.println("you're buying: " + itemList);

        System.out.println("your total is: " + total);
        scanner.close();

    }
}