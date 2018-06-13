import java.util.Scanner;

public class q1110 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 입력값
        int result = 0;
        int cycle = 0;

        Boolean finish = false;
        while(!finish){
            if(cycle == 0){
                result = calculator(n);
            }else{
                result = calculator(result);
            }
            cycle++;
//            System.out.println("n : " + n);
//            System.out.println("result: " + result);
            if(n == result){
                finish = true;
            }
        }

        System.out.println(cycle);

    }

    public static int calculator(int n){
        int a,b,c,d = 0;

        if(n < 10){
            a = 0;
            b = n;
        }else{
            String strN = String.valueOf(n);
            a = strN.charAt(0) - '0'; // char to int : 아스키코드값 알 필요없이 int 변환 가능
            b = strN.charAt(1) - '0'; // char to int : 아스키코드값 알 필요없이 int 변환 가능
        }

        int temp = 0;
        temp = a + b;

        String strTemp = String.valueOf(temp);

        // length() == 2 : 두자리수 / length() == 1 : 한자리수
        if(strTemp.length() < 2){
            c = 0;
            d = strTemp.charAt(0) - '0';
        }else{
            c = strTemp.charAt(0) - '0';
            d = strTemp.charAt(1) - '0';
        }

//        System.out.println("a:"+ a +" / b: "+b  +" / c:"+c +" / d:"+d);

        String temp1 = String.valueOf(b);
        String temp2 = String.valueOf(d);
        String temp3 = temp1 + temp2;
        int temp4 = Integer.parseInt(temp3);

//        System.out.println("temp4 : " + temp4);
        return temp4;

    }
}
