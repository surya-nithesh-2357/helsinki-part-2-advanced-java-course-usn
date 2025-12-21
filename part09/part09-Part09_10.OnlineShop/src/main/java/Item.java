public class Item {

    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice){
        this.qty = qty;
        this.product = product;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return this.qty * this.unitPrice;
    }

    public void increaseQuantity(){
        this.qty+=1;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Item)) return false;
        Item other = (Item) obj;
        return this.product.equals(other.product);
    }

    public String toString(){
        return this.product + ": "+ this.qty;
    }
}
