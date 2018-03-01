import java.util.Scanner;

public class q11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        long result = 0;
        int count = Integer.parseInt(s1);
        for(int i = 0; i < count; i++){
            char c = s2.charAt(i);
            result = result + Integer.parseInt(String.valueOf(c));
        }
        System.out.println(result);
    }
}
