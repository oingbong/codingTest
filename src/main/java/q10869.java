import java.util.Scanner;

public class q10869 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > 0 && a < 10000 && b > 0 && b < 10000 ){
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);
        }
    }
}
