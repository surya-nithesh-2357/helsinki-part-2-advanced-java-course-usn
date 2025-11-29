
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int cnt = 0;
        while(true){
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }
            if (num > 0){
                sum+=num;
                cnt++;
            }
        }
        if (cnt == 0){
            System.out.println("Cannot calculate the average");
        }else{
            double avg = sum/cnt;
            System.out.println(avg);
        }
        
    }
}
