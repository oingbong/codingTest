import java.util.ArrayList;
import java.util.Scanner;

// 아직 안됨
public class q2602 {

    // 예시 : RGS

    public static String[] array1 = {"R","I","N","G","S","R"};
    public static String[] array2 = {"G","R","G","G","N","S"};
//    public static String[] inputArray = new String[]; // 입력값 문자 하나씩 배열로 담기
//    public static String[] resultArray = new String[];
    public static String resultStr = new String();
    public static String inputString;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputString = sc.next(); // 입력값

        for (int i = 0; i < inputString.length(); i++) {
//            inputArray[i] = String.valueOf(inputString.charAt(i));

//            Character c = inputString.charAt(i);
//            String s = String.valueOf(c); // 비교할 문자
            method1(i);
        }


    }


    public static void method1(int i){
        System.out.println("i : " + i);
        System.out.println("inputString : " + inputString);
        System.out.println("inputString22 : " + inputString.charAt(i+1));
        Character c = inputString.charAt(i);
        String s = String.valueOf(c); // 비교할 문자

        for (int j = 0; j < array1.length; j++){ // array1 과 비교
            if(s.equals(array1[j])){
                resultStr = resultStr + s;
                method2(i+1);
            }else{

            }
        }
    }

    public static void method2(int i){
        System.out.println("i : " + i);
        System.out.println("inputString : " + inputString);
        System.out.println("inputString22 : " + inputString.charAt(i+1));

        Character c = inputString.charAt(i);
        String s = String.valueOf(c); // 비교할 문자

        for (int j = 0; j < array2.length; j++){ // array2 과 비교
            if(s.equals(array2[j])){
                resultStr = resultStr + s;
                method1(i+1);
            }else{

            }
        }
    }

}
