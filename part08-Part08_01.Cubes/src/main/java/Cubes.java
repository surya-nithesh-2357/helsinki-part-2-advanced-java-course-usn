
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("end")){
                break;
            }
            int val = Integer.valueOf(str);
            int cube_val = (Integer) (val*val*val);
            System.out.println(cube_val);
        }
        scanner.close();
    }
}
