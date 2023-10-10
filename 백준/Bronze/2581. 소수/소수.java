import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = M ; i<=N; i++)
        {
            List<Integer> clist = new ArrayList<Integer>();
            for(int j = 1; j <= i ; j++)
            {
                if(i%j==0)
                    clist.add(j);
            }
            if(clist.size()==2)
                list.add(i);
        }
        if(list.size()==0)
            System.out.println(-1);
        else
        {
            int min = list.get(0);
            int total = 0;
            for(int i = 0; i<list.size();i++)
            {
                total+=list.get(i);
            }
            System.out.println(total);
            System.out.println(min);
        }
    }
}