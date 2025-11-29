import java.util.Scanner;

public class UserInterface {
    
    private TodoList todoList;
    private Scanner scan;
    
    public UserInterface(TodoList todoList, Scanner scan){
        this.todoList =todoList;
        this.scan = scan;
    }

    public void start(){
        while (true) {
            System.out.print("Command:");
            String command = scan.nextLine();
            if(command.equals("stop")){
                break;
            }
            if(command.equals("add")){
                System.out.print("To add:");
                String task = scan.nextLine();
                todoList.add(task);
            }
            if (command.equals("list")){
                todoList.print();
            }
            if (command.equals("remove")){
                System.out.print("Which one is removed? ");
                int num = scan.nextInt();
                scan.nextLine();
                todoList.remove(num);
            }
        }
    }
}
