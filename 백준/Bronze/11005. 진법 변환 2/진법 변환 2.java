import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int input = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        while(input>0)
        {
            if(input%N<10)
                sb.append((char)(input%N+'0'));
            else
                sb.append((char) (input%N-10+'A'));
            input/=N;
        }
        System.out.println(sb.reverse());
    }
}