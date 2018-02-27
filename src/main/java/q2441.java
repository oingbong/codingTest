import java.util.Scanner;

public class q2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = input; i >= 1; i--){
            String star  = "";
            int countStar = i;
            int countBlank = input - countStar;

            for(int k = 1; k <= countBlank; k++){
                star = star + " ";
            }
            for(int k = 1; k <= countStar; k++){
                star = star + "*";
            }
            System.out.println(star);
        }

    }


}