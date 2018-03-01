import java.util.Scanner;

public class q11721 {
    public static void main(String[] args){
        /*
        * for문에서 int 시작부분과 charAt(i-1) 한 부분은
        * for 돌릴 때 str.length() 값이 원하는 대로 나오지 않아
        * i를 기준으로 \n 을 추가하도록 하였습니다.
        * */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for(int i=1; i <= str.length(); i++){
            char c = str.charAt(i-1);
            result = result + String.valueOf(c);
            if(i % 10 == 0){
                result = result + "\n";
            }
        }
        System.out.println(result);
    }
}
