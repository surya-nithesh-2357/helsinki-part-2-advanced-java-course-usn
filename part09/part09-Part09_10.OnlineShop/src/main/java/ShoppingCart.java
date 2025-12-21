import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    
    private Map<String, Item> myCart;
    public ShoppingCart(){
        this.myCart = new HashMap<>();
    }

    public void add(String product, int price){
        if (myCart.containsKey(product)){
            myCart.get(product).increaseQuantity();
        }else{
            myCart.put(product, new Item(product, 1, price));
        }
    }

    public int price(){
        int tot_price = 0;
        for (Item k: myCart.values()){
            tot_price+=k.price();
        }
        return tot_price;
    }

    public void print(){
        for (Item val: myCart.values()){
            System.out.println(val);
        }
    }
}
