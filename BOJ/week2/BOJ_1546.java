package week2;

import java.util.Collections;
import java.util.*;
public class BOJ_1546 {
    public static void main(String[] args) {
        int N;
        double total = 0;

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        double []  score_list = new double[N];
        List<Double> score_arraylist = new ArrayList<Double>();

        for(int i = 0; i < N ; i++){
            score_list[i] = scanner.nextDouble();
            score_arraylist.add(score_list[i]);
        }
        double max_score = Collections.max(score_arraylist);
        for(int i = 0; i < N; i++){
            score_list[i] = score_list[i]/max_score*100;
            total += score_list[i];
        }
        System.out.println(total/N);

    }
}
