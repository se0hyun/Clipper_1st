package week2;
import java.io.*;
import java.util.ArrayList;

public class BOJ_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] word_array = new char [5][15];
        int max_line = 0;
        for(int i = 0; i < 5; i++){
            String string = bufferedReader.readLine();
            for(int j = 0; j < string.length(); j++){
                word_array[i][j] = string.charAt(j);
            }
        }
        for(int j =0; j < 15; j++){
            for(int i = 0; i < 5 ; i++){
                if(word_array[i][j] != '\0'){
                    bufferedWriter.write(word_array[i][j]);
                }
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
//        for(int i = 0; i < 5; i++){
//            for(int j = 0; j < 15; j++){
//                word_array[i][j] = '*';
//            }
//        }
//        for(int i = 0; i < 5; i++){
//            String string = bufferedReader.readLine();
//            if (string.length() > max_line){
//                max_line = string.length();
//            }
//            word_array[i] = string.toCharArray();
//        }
//        for(int j = 0; j < max_line; j++){
//            for(int i = 0; i < 5; i++){
//                if(word_array[i][j] == '*'){
//                    continue;
//                }else{
//                    System.out.print(word_array[i][j]);
//                }
//            }
//        }

    }
}
