public class Cat extends Animal implements NoiseCapable{

    public Cat(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    public Cat(){
        super("Cat");
    }

    public void purr(){
        System.out.println(super.getName()+" purrs");
    }

    @Override
    public void makeNoise() {
        // TODO Auto-generated method stub
        this.purr();
    }
    
}
