import java.util.ArrayList;
import java.util.Scanner;

public class q4344 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // 테스트케이스 개수

        for(int i=0; i<count; i++){
            int studentNumber = sc.nextInt();

            int total = 0;
            ArrayList<Integer> eachScore = new ArrayList<Integer>();
            for(int j=0; j<studentNumber; j++){
                int num = sc.nextInt(); // 학생의 점수
                total += num;
                eachScore.add(num);
            }

            int average = total / studentNumber;
            int overScoreStudent = 0;
            for(int k=0; k<eachScore.size(); k++){
                if(eachScore.get(k) > average){
                    overScoreStudent++;
                }
            }
            double result = overScoreStudent / (double)studentNumber * 100;
            double result2 = Math.round(result*1000d) / 1000d;

//            System.out.println(result2+"%");
            System.out.printf("%.3f", result);
            System.out.println("%");

        }
    }
}
