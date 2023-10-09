import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1)
                break;
            List<Integer> list = new ArrayList<Integer>();
            int total = 0;
            for (int i = 1; i < n; i++) 
            {
                if (n % i == 0)
                {
                    list.add(i);
                    total += i;
                }
            }    
            sb.append(n);
            if (total == n) 
            {
                sb.append(" = ");
                for (int j = 0; j < list.size() - 1; j++)
                    sb.append(list.get(j)).append(" + ");

                sb.append(list.get(list.size() - 1));
            } 
            else
                sb.append(" is NOT perfect.");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}