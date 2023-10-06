import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for(int i = 1;i<=N; i++)
        {
            if(N%i==0)
                sb.append(i).append(" ");
        }
        String[] answer = sb.toString().split(" ");
        if(answer.length>=K)
            System.out.println(answer[K-1]);
        else
            System.out.println(0);
    }
}