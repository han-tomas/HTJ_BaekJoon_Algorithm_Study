import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a1 ={Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] a2 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] a3 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        int x;
        int y;
        if (a1[0] == a2[0]) 
        {	
			x = a3[0];
		}
		else if (a1[0] == a3[0]) 
        {
			x = a2[0];
		}
		else 
        {
			x = a1[0];
		}        
		if (a1[1] == a2[1]) 
        {
			y = a3[1];
		}
		else if (a1[1] == a3[1])
        {
			y = a2[1];
		}
		else 
        {
			y = a1[1];
		}
		System.out.println(x+ " " +y);
    }
}