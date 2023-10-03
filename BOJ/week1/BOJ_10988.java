package week1;
import java.util.Scanner;
public class BOJ_10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int len = word.length();
        boolean isPalindrome = false;

        if (len == 1) {
            isPalindrome = true;
        } else {
            for (int i = 0; i < len / 2; i++) {
                if (word.charAt(i) != word.charAt(len - 1 - i)) {
                    isPalindrome = false;
                    break;
                } else {
                    isPalindrome = true;
                }
            }
        }

        if (isPalindrome) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
    }

