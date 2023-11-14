package week5;

import java.util.*;
import java.lang.*;
public class BOJ_25192 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<String> chats = new ArrayList<>();

        for(int i = 0; i<N; i++){
            String chat = scanner.nextLine();
            if (!chat.matches("ENTER")){
                chats.add(chat);
            }
        }
        System.out.println(chats.size());
    }
}
