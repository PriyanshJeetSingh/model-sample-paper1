// WRITE A PROGRAM TO INPUT A NUM. FIND THE SUM OF DIGIT AND THE NUM OF THE DIGIT
import java.util.*;
public class MSPL1_10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th number");
        int n = sc.nextInt();
        int sum = 0;
        int num_of_digits= 0;
        int temp = Math.abs(n);
        while(temp>0){
            int digit = temp%10;
            sum +=digit;
            num_of_digits++;
            temp /= 10;
        }    
        System.out.println("Sum of digits: " + sum);
        System.out.println("Number of digits: " + num_of_digits);
    }
}