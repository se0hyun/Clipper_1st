package week1;
import java.util.Scanner;
public class BOJ_1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int continuous_word = 0;
        for (int i = 0; i < N ; i++){
            boolean is_continue = false;
            String word = scanner.next();
            for (int j=0; j<word.length()-1; j++){
                char currentChar = word.charAt(j);
                String remainingChars = word.substring(j+1);
                if (currentChar != word.charAt(j+1)){
                    if(remainingChars.contains(String.valueOf(currentChar))){
                        is_continue = false;
                        break;
                    }else {
                        is_continue = true;
                    }
                }else{
                    is_continue = true;
                }
            }
            if (is_continue || word.length() == 1){
                continuous_word += 1;
            }

        }
        System.out.println(continuous_word);
    }
}