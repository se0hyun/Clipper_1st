package week2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] board = new int[100][100]; // 100x100 크기의 도화지를 만듭니다.

        int N = Integer.parseInt(br.readLine()); // 색종이의 개수를 입력 받습니다.

        // 색종이를 도화지에 덮는 과정을 반복합니다.
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()); // 색종이의 왼쪽 아래 x 좌표
            int y = Integer.parseInt(st.nextToken()); // 색종이의 왼쪽 아래 y 좌표

            // 색종이가 덮는 부분을 1로 표시합니다.
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    board[j][k] = 1;
                }
            }
        }

        // 도화지에서 1로 표시된 부분의 개수를 세어 넓이를 구합니다.
        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (board[i][j] == 1) {
                    area++;
                }
            }
        }

        System.out.println(area);
    }
}
