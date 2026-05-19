import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args){
        /* I'll start documenting and adding comments
        anyways, I'm folowing an algorithm here
        1. declaring the variables
        2. adding conditions
        3. organising the input statements
        4. doing the math logic (i'll use the math library for this one)
        5. generating the output
         */

        Scanner inp = new Scanner(System.in);
        int choice;
        //actually nvm i'm learning functions now
        inputChoice();
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
                choice = inp.nextInt();
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
        System.out.println("alright, freedom units it is");
        //having fun lwk with java
        System.out.print("loading choices");
        waitingLoop();
        // i wanna add delay for dramatic effects, but idk the import, imma google it in a gif
        System.out.print("\nplease enter your height in inches: ");
        double height = inp.nextDouble();
        System.out.print("now enter your weight in lbs: ");
        double weight = inp.nextDouble();
        // yeah i just learned how to use the math library
        System.out.print("calculating");
        waitingLoop();
        double bodyMass = weight / Math.pow(height / 100, 2);
        System.out.printf("\nyour body mass is: %.2f%n", bodyMass);
    }
    static void calcBMmetric(Scanner inp){
        System.out.println("okay then, metrics it is");
        System.out.print("loading choices");

        waitingLoop();
        // i'd add delay later
        System.out.print("\nplease enter your height in cms: ");
        double height = inp.nextDouble();
        System.out.print("now enter your weight in kgs: ");
        double weight = inp.nextDouble();
        // yeah i just learned how to use the math library
        double bodyMass = weight / Math.pow(height / 100, 2);
        System.out.print("calculating");
        waitingLoop();
        System.out.printf("\nyour body mass is: %.2f%n ", bodyMass);
    }
    static void inputChoice(){
        System.out.println("do you want your BM in freedom units or metric system?: ");
        System.out.print("1. freedom units \n2. metric system\nyour answer: ");
    }
    static void waitingLoop(){
        for (int i = 0; i < 3; i++) {
            char dot = '.';
            try {
                System.out.printf("%s",dot);
                dot++;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
