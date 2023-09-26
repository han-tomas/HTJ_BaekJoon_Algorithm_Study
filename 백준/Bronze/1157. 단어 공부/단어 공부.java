import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] alpha = new int[26];
        for(int i = 0; i < input.length(); i ++)
        {
            if(input.charAt(i)>='A' && input.charAt(i)<='Z')
            {
                alpha[input.charAt(i)-'A']++;
            }
            else
            {
                alpha[input.charAt(i)-'a']++;
            }
        }
        int max = 0;
        char result = '?';
        for(int i = 0; i<26; i++)
        {
            if(alpha[i]>max)
            {
                max = alpha[i];
                result = (char)(i+65);
            }           
            else if(alpha[i]==max)
                result ='?';
        }
        System.out.println(result);
    }
}