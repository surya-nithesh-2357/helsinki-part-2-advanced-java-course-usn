import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    HashMap<String,ArrayList<String>>facility;
    
    public StorageFacility(){
        this.facility = new HashMap<String,ArrayList<String>>();
    }

    public void add(String unit, String item){
        this.facility.putIfAbsent(unit, new ArrayList<String>());
        ArrayList<String> completed = this.facility.get(unit);
        completed.add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        return this.facility.getOrDefault(storageUnit,new ArrayList<>());
    }

    public void remove(String storageUnit, String item){
        if (this.facility.containsKey(storageUnit)){
            this.facility.get(storageUnit).remove(item);
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> keys = new ArrayList<String>();
        for (String k : this.facility.keySet()){
            if (this.facility.get(k).size() > 0){
                keys.add(k);
            }
        }
        return keys;
    }
}
