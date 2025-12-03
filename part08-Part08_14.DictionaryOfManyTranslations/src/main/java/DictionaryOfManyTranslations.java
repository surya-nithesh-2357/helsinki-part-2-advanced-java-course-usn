import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String ,ArrayList<String>> myHash;

    public DictionaryOfManyTranslations(){
        this.myHash = new HashMap<String,ArrayList<String>>();
    }
    public void add(String word, String translation){
        if (!(this.myHash.containsKey(word))){
            this.myHash.put(word, new ArrayList<>());
            this.myHash.get(word).add(translation);
        } else {
            this.myHash.get(word).add(translation);
        }
    }

    public ArrayList<String> translate(String word){
         if (!this.myHash.containsKey(word)){
            return new ArrayList<>();
         }else{
            return this.myHash.get(word);
         }
    }

    public void remove(String word){
        if (myHash.containsKey(word)){
            myHash.remove(word);
        }
    }

}
