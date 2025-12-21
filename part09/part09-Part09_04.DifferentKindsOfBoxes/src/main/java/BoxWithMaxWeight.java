import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> box;
    public BoxWithMaxWeight(int capacity){
        this.maxWeight = capacity;
        this.box = new ArrayList<Item>();
    }

    @Override
    public void add(Item item) {
        if (item.getWeight()+this.WeightinBox() <= maxWeight){
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

    public int WeightinBox(){
        int tot_weight = 0;
        for (Item i: box){
            tot_weight += i.getWeight();
        }
        return tot_weight;
    }

    
}
