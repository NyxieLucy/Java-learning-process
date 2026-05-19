apparently i suck at loops, check this prototype version of the project:
``` import java.util.Scanner;
import java.math.*;

public class Main {
public static void main(String[] args){


        Scanner inp = new Scanner(System.in);
        int choice;
        System.out.println("do you want your BM in freedom units or metric system?: ");
        System.out.print("1. freedom units \n2. metric system\nyour answer: ");
        choice = inp.nextInt();
        // yeah here i'm just using boolean for the sake of boolean, i wanna manipulate data
        // okay nvm that was stupid, overwriting stuff, i'll get to use bolean later

        if(choice == 1){
            calcBMfreedom(inp);
        } else if (choice == 2) {
            calcBMmetric(inp);
        }
        else {

            while (choice != 1 || choice != 2) {
                inputChoice();
                if (choice == 1){
                    calcBMfreedom(inp);
                    break;
                }
                else if (choice == 2){
                    inputChoice();
                    calcBMmetric(inp);
                    break;
                }
            }
        }
        inp.close();
    }

    static void calcBMfreedom(Scanner inp){
        System.out.print("alright, freedom units it is");
        // i wanna add delay for dramatic effects, but idk the import, imma google it in a gif
        System.out.print("please enter your height in inches: ");
        double height = inp.nextDouble();
        System.out.print("now enter your weight in lbs: ");
        double weight = inp.nextDouble();
        // yeah i just learned how to use the math library
        double bodyMass = weight / Math.pow(height, 2);
        System.out.printf("your body mass is: %s", bodyMass);
    }
    static void calcBMmetric(Scanner inp){
        System.out.print("okay then, metrics it is");
        // i'd add delay later
        System.out.print("please enter your height in cms: ");
        double height = inp.nextDouble();
        System.out.print("now enter your weight in kgs: ");
        double weight = inp.nextDouble();
        // yeah i just learned how to use the math library
        double bodyMass = weight / Math.pow(height, 2);
        System.out.printf("your body mass is: %s", bodyMass);
    }
    static void inputChoice(){
        System.out.println("Invalid input, try again");
        System.out.println("type 1 for freedom units, 2 for metric");
    }
}
```
something wrong with it, i'll fix it in the next update