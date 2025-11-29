
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first_container = 0;
        int sec_container = 0;

        while (true) {
            System.out.print("> ");
            System.out.println("First: "+first_container+"/100");
            System.out.println("Second: "+sec_container+"/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                if (amount > 0){
                    if (first_container + amount <= 100){
                        first_container+=amount;
                    }else{
                        first_container = 100;
                    }
                }
            }
            if (command.equals("move") && amount > 0){
                if (amount >= first_container){
                    amount = first_container;
                    first_container = 0;
                }else{
                    first_container -= amount;
                }
                if (sec_container + amount <= 100){
                    sec_container+=amount;
                }else{
                    sec_container = 100;
                }
            }
            if (command.equals("remove") && amount > 0){
                if (amount >= sec_container){
                    sec_container = 0;
                }else{
                    sec_container -= amount;
                }
            }

        }
    }

}
