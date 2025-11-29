import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> myList;
    
    public TodoList(){
        this.myList = new ArrayList<String>();
    }

    public void add(String task){
        this.myList.add(task);
    }

    public void print(){
        for (int i =0 ; i< myList.size(); i++){
            System.out.println(i+1+": "+myList.get(i));
        }
    }

    public void remove(int number){
        this.myList.remove(number-1);
    }
}
