import java.util.Scanner;

public class q2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = 1; i <= input; i++){
            String star = "";
            // ex : i = 1; input = 5;
            int countBlank = input - i; // 전체 값에서 i만큼(star가 나타나야할) 제외한 앞부분을 Blank로 먼저 채움
            int countStar = input - countBlank; // 전체 값에서 Blank 자리를 제외한 나머지를 Star로 채움
            for(int j = 1; j <= countBlank; j++){
                star = star + " ";
            }
            for(int j = 1; j <= countStar; j++){
                star = star + "*";
            }
            System.out.println(star);
        }

    }


}