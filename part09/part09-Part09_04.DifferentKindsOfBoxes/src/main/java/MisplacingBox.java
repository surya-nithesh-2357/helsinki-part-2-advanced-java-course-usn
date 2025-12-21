import java.util.ArrayList;

public class MisplacingBox extends Box{

    private ArrayList<Item>lostBox;

    public MisplacingBox(){
        this.lostBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        // TODO Auto-generated method stub
        this.lostBox.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'isInBox'");
        return false;
    }
}
