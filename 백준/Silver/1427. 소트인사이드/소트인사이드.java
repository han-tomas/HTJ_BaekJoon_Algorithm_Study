import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        List<Character> list = new ArrayList<Character>();
        for(char c : input.toCharArray()){
            list.add(c);
        }
        Collections.sort(list,Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(char c : list)
            sb.append(c);
        System.out.print(sb);
    }
}