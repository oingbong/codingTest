import java.util.Scanner;

public class q2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = input; i >= 1; i--){
            String star = "";
            for(int k = 1; k <= i; k++){
                star = star + "*";
            }
            System.out.println(star);
        }

    }


}