import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double>change;

    public ChangeHistory(){
        this.change = new ArrayList<Double>();
    }

    public void add(double status){
        this.change.add(status);
    }

    public void clear(){
        this.change = new ArrayList<>();
    }

    public double maxValue(){
        double max = 0.0;
        for (double d : this.change){
            max = Math.max(max, d);
        }
        return max;
    }

    public double minValue(){
        if (this.change.size() == 0){
            return 0;
        }
        double min = Double.MAX_VALUE;
        for (double d : this.change){
            min = Math.min(min, d);
        }
        return min;
    }

    public double average(){
        if (this.change.size() == 0){
            return 0;
        }
        double sum = 0.0;
        for (double d : this.change){
            sum += d;
        }
        return sum/this.change.size();
    }

    public String toString(){
        return change.toString();
    }
}
