import java.util.ArrayList;

public class Box implements Packable{
    private double maxWeight;
    private ArrayList<Packable> myBox;

    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.myBox = new ArrayList<>();
    }

    public void add (Packable pack){
        if (pack.weight()+ this.weight() <= maxWeight){
            myBox.add(pack);
        }
    }

    @Override
    public double weight() {
        double tot_weight = 0.0;
        if (myBox.size() > 0){
            for (Packable r: myBox){
                tot_weight +=r.weight();
            }
        }
        return tot_weight;
    }

    public String toString(){
        return "Box: "+myBox.size()+" items, "+ "total weight "+this.weight()+" kg";
    }
    
}
