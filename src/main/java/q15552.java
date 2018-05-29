import java.io.*;

public class q15552 {
    public static void main(String arg[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        for(int i=0; i<n; i++){
            String numbers = br.readLine();
            int idx = numbers.indexOf(" ");
            int n1 = Integer.parseInt(numbers.substring(0, idx));
            int n2 = Integer.parseInt(numbers.substring(idx + 1, numbers.length()));
            wr.write(n1 + n2 + "\n");
        }

        wr.flush();

    }
}
