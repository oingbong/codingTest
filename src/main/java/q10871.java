import java.util.ArrayList;
import java.util.Scanner;

public class q10871 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        //ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a < x){
                //numbers.add(a);
                System.out.println(a);
            }
        }

        //System.out.println(numbers);
    }
}
