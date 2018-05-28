import java.util.Scanner;

public class q10817 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && b == c){
            System.out.println(a);
        }else if(a > b){
            if(b > c){
                System.out.println(b);
            }else if(c > a){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else if(a > c){
            if(c > b){
                System.out.println(c);
            }else if(b > a){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
        }else if(b > c){
            if(c > a){
                System.out.println(c);
            }else if(a > b){
                System.out.println(b);
            }else{
                System.out.println(a);
            }
        }else if(b > a){
            if(a > c){
                System.out.println(a);
            }else if(c > b){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }else if(c > a){
            if(a > b){
                System.out.println(a);
            }else if(b > c){
                System.out.println(c);
            }else{
                System.out.println(b);
            }
        }else if(c > b){
            if(b > a){
                System.out.println(b);
            }else if(a > c){
                System.out.println(c);
            }else{
                System.out.println(a);
            }
        }
    }
}
