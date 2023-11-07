package week3;

import java.io.*;
import java.util.*;

public class BOJ_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        int[][] arr = new int[N][2];

        StringTokenizer stringTokenizer;
        for(int i = 0; i < N; i++) {
            // 위치 주의
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            arr[i][1] = Integer.parseInt(stringTokenizer.nextToken());
            arr[i][0] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i< N ; i++) {
            // 위치 주의
            stringBuilder.append(arr[i][1] + " " + arr[i][0]).append('\n');
        }
        System.out.println(stringBuilder);
    }
}
