import java.util.ArrayList;

public class OneItemBox extends Box{
    private ArrayList<Item> box;
    
    public OneItemBox(){
        this.box = new ArrayList<>();
    }
    @Override
    public void add(Item item) {
        if (box.size() == 0){
            box.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        // TODO Auto-generated method stub
        if (box.contains(item)){
            return true;
        }
        return false;
    }
}
