import java.time.Period;
import java.util.Scanner;
import java.time.format.DateTimeParseException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your date of birth (yyyy-mm-dd): ");
        String dobInput = scan.nextLine();



        try {
            LocalDate dob = LocalDate.parse(dobInput);
            LocalDate today = LocalDate.now();
            int age = Period.between(dob, today).getYears();
            if (age >= 18){
                System.out.println("you are an adult, access granted");
            }
            else {
                System.out.println("under 18 years old, access denied");
            }
        }
        //error handling w kda z3ma hhhhhhh
        catch (DateTimeParseException e){
            System.out.println("error occur, try again later, or dont forget to add '-' between dates");
        }
        scan.close();
    }
}