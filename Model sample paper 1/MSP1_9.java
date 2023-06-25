/*2/3, 4/5, 8/7, 16/9, 32/11, 64/13,128/15,256/17, 512/19, 1024/21, 2048/23, 4096/25 */

public class MSP1_9 {
    public static void main(String[] args) {
        int terms = 20;
        double sum = 0.0;
        double numerator = 2.0;
        double denominator = 3.0;

        for (int i = 1; i <= terms; i++) {
            sum += numerator / denominator;
            numerator *= 2;
            denominator += 2;
        }

        System.out.println("Sum of the series: " + sum);
    }
}
