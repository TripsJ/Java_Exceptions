
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int nums[] =new  int[10]; // Arrays are objects
        for (int i = 0; i < 10; i++) {
            nums[i]= r.nextInt(7);
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < 10; i++) {
            if (i > 0){
                try{
                    System.out.println("try");
                    System.out.println(nums[i]/nums[i-1]);
                }
                catch(ArithmeticException e){
                    System.out.println("integer division by zero");

                }
            }
            
        }

    }
}