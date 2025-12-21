import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> group;

    public Herd(){
        this.group = new ArrayList<Movable>();
    }
    public void addToHerd(Movable movable){
        this.group.add(movable);
    }

    public void move(int dx, int dy){
        for (Movable m: group){
            m.move(dx, dy);
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (Movable m : group) {
            if (!first) {
                sb.append("\n");
            }
            sb.append(m.toString());
            first = false;
        }
        return sb.toString();
    }
}
