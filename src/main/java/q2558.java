import java.util.Scanner;

public class q2558 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        // N 킬로그램 배달양
        int n = sc.nextInt();
        // 봉지개수
        int b5 = 0;
        int b3 = 0;

        while( n % 5 != 0 && n >= 0){
            n -= 3;
            b3++;
        }

        if(n < 0){
            System.out.println(-1);
        }else{
            b5 = n / 5;
            System.out.println(b5 + b3);
        }

    }
}
