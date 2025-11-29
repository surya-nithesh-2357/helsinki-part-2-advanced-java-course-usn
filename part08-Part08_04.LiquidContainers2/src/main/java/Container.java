public class Container {
    private int amount;

    public Container(){
        this.amount = 0;
    }

    public int contains(){
        return this.amount;
    }
    public void  setContainer(int val){
        this.amount = val;
    }

    public void add(int additional_amount){
        if (additional_amount > 0){
            if (additional_amount + this.amount <= 100){
                amount += additional_amount;
            }else{
                amount = 100;
            }
        }
    }

    public void remove(int remove_amount){
        if (remove_amount > 0){
            if (remove_amount >= this.amount){
                    this.amount = 0;
                }else{
                    amount-=remove_amount;
                }
        }
    }

    public String toString(){
        return this.amount + "/100";
    }
}
