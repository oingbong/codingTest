import java.util.Scanner;

public class q1152 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        int count = 0;
        Boolean checkEmpty = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i - 1) != ' ') {
                count++;
            }
            else{
                checkEmpty=true;
            }
        }

        if(checkEmpty) {
            System.out.println(count + 1);
        }else {
            System.out.println(count);
        }


    }
}

//public class q1152 {
//    public static void main(String[] args){
//
//        // 다시해야함
//
//        Scanner sc = new Scanner(System.in);
//
//        String sentence = sc.nextLine().trim();
//        String[] sentences = sentence.split(" ");
//        Integer countSentence = 0;
//
//        for (Integer i=0; i < sentences.length; i++){
//            System.out.println(sentences[i]);
//            if(!sentences[i].equals("")){
//                countSentence++;
//            }
//        }
//
//        System.out.println(countSentence);
//    }
//}
