import java.util.Scanner;

public class q2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        String star = "";
        for(int i = 1; i <= input; i++){
            star = star + "*";
            System.out.println(star);
        }
    }


}