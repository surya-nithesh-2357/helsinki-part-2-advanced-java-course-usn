public class CD implements Packable{
    private String artist;
    private String name;
    private int yearPublished;

    public CD(String artist, String name, int year){
        this.artist = artist;
        this.name = name;
        this.yearPublished = year;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    public String toString(){
        return this.artist + ": "+ this.name+" ("+this.yearPublished+")";
    }

    
}
