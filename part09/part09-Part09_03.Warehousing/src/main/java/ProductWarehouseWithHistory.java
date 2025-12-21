public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory cHistory = new ChangeHistory();
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.cHistory.add(initialBalance);
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        cHistory.add(super.getBalance());

    }

    public double takeFromWarehouse(double amount){
        double money = super.takeFromWarehouse(amount);
        cHistory.add(super.getBalance());
        return money;
    }

    public void printAnalysis(){
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+history());
        System.out.println("Largest amount of product: "+ cHistory.maxValue());
        System.out.println("Smallest amount of product: "+ cHistory.minValue());
        System.out.println("Average: "+cHistory.average());
    }

    public String history(){
        return this.cHistory.toString();
    }
}