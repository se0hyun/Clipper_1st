package week4;
import java.util.*;

public class BOJ_11866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int top = -1;

        int K = scanner.nextInt();
        int[] arr = new int[K];


        for(int i = 0; i < K; i++) {

            int number = scanner.nextInt();	// 정수 입력

            if (number == 0) {
                top--;
            }
            else {
                top++;
                arr[top] = number;
            }
        }
        int sum = 0;
        for (int i = 0; i <= top; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

    }
}
