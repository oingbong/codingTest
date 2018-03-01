import java.util.Scanner;

public class q8393 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int result = 0;
        for(int i = 1; i <= input; i++){
            result = result + i;
        }
        System.out.println(result);
    }
}
