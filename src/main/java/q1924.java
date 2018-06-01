import java.util.*;
public class q1924{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a = sc.nextInt();
        b = sc.nextInt();
        //a = 2;
        //b = 1;
        c = 0;
        d = 0;
        
        int arrDays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        String arrWeeks[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        for(int i = 1; i <= arrDays.length; i++) {
            if(i == a){
                break;
            }
             
            c = c + arrDays[i-1];
        }

        c = c + b;
        
        
        d = c % 7;
        
        System.out.println(arrWeeks[d]);
    }
}
