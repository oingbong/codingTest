import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class q4673 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1; i <= 10000; i++){
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            if(i < 10){
                a = i;
                b = 0;
                c = 0;
                d = 0;
            }else if(i < 100){
                String str = String.valueOf(i);
                a = str.charAt(0) - '0';
                b = str.charAt(1) - '0';
                c = 0;
                d = 0;
            }
            else if(i < 1000){
                String str = String.valueOf(i);
                a = str.charAt(0) - '0';
                b = str.charAt(1) - '0';
                c = str.charAt(2) - '0';
                d = 0;
            }
            else if(i < 10000){
                String str = String.valueOf(i);
                a = str.charAt(0) - '0';
                b = str.charAt(1) - '0';
                c = str.charAt(2) - '0';
                d = str.charAt(3) - '0';
            }
            int temp = i + a + b + c + d;
            list.add(temp);
        }

        Collections.sort(list); // 오름차순 정렬

        for(int i=1; i <= 10000; i++){
            if(list.contains(i)){
                // 있으면
                list.removeFirst();

                if(list.get(1) == list.getFirst()){
                    list.removeFirst();
                }

            }else{
                // 없으면
                System.out.println(i);
            }
        }

    }
}


// Best
/*
public class test {
    public static void main(String[] args) {
        boolean[] isNotSelfNumber = new boolean[1001];

        for (int i = 1; i <= 1000; ++i) {
            int dn = getDn(i);
            if (dn <= 1000) {
                isNotSelfNumber[dn] = true;
            }
        }

        for (int i = 1; i < isNotSelfNumber.length; ++i) {
            if (!isNotSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }

    private static int getDn(int n) {
        int dn = n;
        while(n > 0) {
            dn += n % 10;
            n /= 10;
        }
        return dn;
    }
}
*/
