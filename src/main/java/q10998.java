import java.util.Scanner;

public class q10998 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int int1 = sc.nextInt();
        int int2 = sc.nextInt();

        if(int1 > 0 && int1 < 10 && int2 > 0 && int2 < 10 ){
            System.out.println(int1 * int2);
        }
    }
}
