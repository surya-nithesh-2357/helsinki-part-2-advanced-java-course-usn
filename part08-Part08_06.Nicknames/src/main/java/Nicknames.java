
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap <String,String> nicMap = new HashMap<String,String>();
        nicMap.put("matthew", "matt");
        nicMap.put("michael", "mix");
        nicMap.put("arthur", "artie");
        System.out.println(nicMap.get("matthew"));
    }

}
