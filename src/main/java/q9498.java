import java.util.Scanner;

public class q9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String : 메모리 9504 KB / 시간 104 MS
        // char : 메모리 9504 KB / 시간 112 MS
        int input = sc.nextInt();
        char result;

        if(input >= 90 && input <= 100){
            result = 'A';
        }else if(input >= 80 && input < 90){
            result = 'B';
        }else if(input >= 70 && input < 80){
            result = 'C';
        }else if(input >= 60 && input < 70){
            result = 'D';
        }else{
            result = 'F';
        }
        System.out.println(result);

    }


}