public class TripleTacoBox implements TacoBox{
    private int tacos;

    public TripleTacoBox(){
        this.tacos = 3;
    }

    @Override
    public int tacosRemaining() {
        // TODO Auto-generated method stub
        return this.tacos;
        // throw new UnsupportedOperationException("Unimplemented method 'tacosRemaining'");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        if (this.tacos > 0){
            this.tacos --;
        }
        // throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }

}
