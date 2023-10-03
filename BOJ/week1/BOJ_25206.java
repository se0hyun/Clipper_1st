package week1;
import java.io.*;
import java.util.*;

public class BOJ_25206 {
    public static void main(String[] args) throws IOException {
        Map<String, Double> gradeDict = new HashMap<>();
        gradeDict.put("A+", 4.5);
        gradeDict.put("A0", 4.0);
        gradeDict.put("B+", 3.5);
        gradeDict.put("B0", 3.0);
        gradeDict.put("C+", 2.5);
        gradeDict.put("C0", 2.0);
        gradeDict.put("D+", 1.5);
        gradeDict.put("D0", 1.0);
        gradeDict.put("F", 0.0);

        double scoreSum = 0.0;
        double creditSum = 0.0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            String subject = input[0];
            double credit = Double.parseDouble(input[1]);
            String grade = input[2];

            if (grade.equals("P")) {
                continue;
            }

            if (gradeDict.containsKey(grade)) {
                double gradeValue = gradeDict.get(grade);
                scoreSum += credit * gradeValue;
                creditSum += credit;
            }
        }

        double averageGrade = scoreSum / creditSum;
        System.out.println(averageGrade);

    }
}
