import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first number: ");
        double x = scanner.nextDouble();
        System.out.println("enter your operator (+,/,*,-): ");
        String operator = scanner.next();
        System.out.println("enter your second number: ");
        double y = scanner.nextDouble();
        if (operator.equals("+")) {
            System.out.println("your some is: " + (x + y));
        } else if (operator.equals("-")) {
            System.out.println("your substacrtion is : " +  (x - y));
        }
        else if (operator.equals("*")){
            System.out.println("your multiplication: " + (x * y));
        } else if (operator.equals("/")) {
            if (y != 0){
                System.out.println("your division is: " + (x / y));
            }
            else {
                System.out.println("impossible operation");
            }
        }
        else {
            System.out.println("dam, it aint working");
        }
        scanner.close();
    }
}