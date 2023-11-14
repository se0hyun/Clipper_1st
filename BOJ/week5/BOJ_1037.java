package week5;

import java.util.*;
public class BOJ_1037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();

        int []  nums = new int[cnt];
        List<Integer> nums_arraylist = new ArrayList<Integer>();

        for(int i = 0; i < cnt ; i++){
            nums[i] = scanner.nextInt();
            nums_arraylist.add(nums[i]);
        }

        int max = Collections.max(nums_arraylist);
        int min = Collections.min(nums_arraylist);

        System.out.println(max*min);

    }
}
