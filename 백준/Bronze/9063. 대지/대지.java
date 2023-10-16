import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int xmin=10000;
        int ymin=10000;
        int xmax=-10000;
        int ymax=-10000;
        if(N<=1)
            System.out.println(0);
        else
        {
            for(int i = 0; i<N;i++)
            {
                st =  new StringTokenizer(br.readLine());
                int x=Integer.parseInt(st.nextToken());
                int y=Integer.parseInt(st.nextToken());
                if(x>xmax)
                    xmax=x;
                if(y>ymax)
                    ymax=y;
                if(x<xmin)
                    xmin=x;
                if(y<ymin)
                    ymin=y;
            }
            System.out.println((xmax-xmin)*(ymax-ymin));
        }    
    }
}