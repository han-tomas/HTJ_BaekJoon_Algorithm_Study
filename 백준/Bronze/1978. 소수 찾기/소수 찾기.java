import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int count = 0;
        for(int i = 0; i<N; i++)
        {
            int n = Integer.parseInt(input[i]);
            List<Integer> list = new ArrayList<Integer>();
            for(int j = 1; j<=n ; j++)
            {
                if(n%j==0)
                    list.add(j);
            }
            if(list.size()==2)
                count++;
        }
        System.out.println(count);
    }
}