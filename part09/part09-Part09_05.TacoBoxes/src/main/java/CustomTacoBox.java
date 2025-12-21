public class CustomTacoBox implements TacoBox{
    private int tacos;

    public CustomTacoBox(int init_tacos){
        this.tacos = init_tacos;
    }

    @Override
    public int tacosRemaining() {
        // TODO Auto-generated method stub
        return this.tacos;
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
         if (this.tacos > 0){
            this.tacos --;
        }
    }
}
