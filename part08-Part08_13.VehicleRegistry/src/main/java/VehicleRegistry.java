import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegistry {
    
    private HashMap<LicensePlate,String> vehicleHashMap;
    public VehicleRegistry(){
        this.vehicleHashMap = new HashMap< LicensePlate, String>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if (this.vehicleHashMap.containsKey(licensePlate)){
            return false;
        }
        vehicleHashMap.put(licensePlate,owner);
        return true;
    }


    public String get(LicensePlate licensePlate){
        return this.vehicleHashMap.getOrDefault(licensePlate,null);
    }

    public boolean remove(LicensePlate licensePlate){
        if (this.vehicleHashMap.containsKey(licensePlate)){
            this.vehicleHashMap.remove(licensePlate);
            return true;
        }
        return false;
    }


    public void printLicensePlates(){
        for (LicensePlate l :this.vehicleHashMap.keySet()){
            System.out.println(l);
        }
    }

    public void printOwners(){
        HashSet<String> owners = new HashSet<String>();
        for (String owner:this.vehicleHashMap.values()){
            owners.add(owner);
          }

        for (String own : owners){
            System.out.println(own);
        }
    }
}
