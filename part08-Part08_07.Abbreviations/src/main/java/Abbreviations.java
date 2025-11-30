import java.util.HashMap;

public class Abbreviations {
    private HashMap<String,String> myHash;
    
    public Abbreviations(){
        this.myHash = new HashMap<String,String>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        this.myHash.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        return this.myHash.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
        return this.myHash.get(abbreviation);
    }
}
