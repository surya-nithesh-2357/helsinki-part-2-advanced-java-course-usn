import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> priceHash;
    private Map<String, Integer> stockHash;
    
    public Warehouse(){
        priceHash = new HashMap<>();
        stockHash = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        priceHash.put(product, price);
        stockHash.put(product, stock);
    }

    public int price(String product){
        return priceHash.getOrDefault(product,-99);
    }

    public int stock(String product){
        return stockHash.getOrDefault(product, 0);
    }

    public boolean take(String product){
        int current = stockHash.getOrDefault(product, 0);
        if (current <= 0){
            return false;
        }
        stockHash.put(product, current-1);
        return true;
    }

    public Set<String> products(){
        return priceHash.keySet();
    }
}
