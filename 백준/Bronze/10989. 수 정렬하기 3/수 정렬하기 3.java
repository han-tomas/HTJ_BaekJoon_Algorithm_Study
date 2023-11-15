import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        int[] count = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0 ; i<N ; i++){
            count[Integer.parseInt(br.readLine())]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<10001; i++){
            while(count[i]>0){
                sb.append(i).append("\n");
                count[i]--;
            }
        }
        System.out.print(sb);
    }
}