import java.util.*;


public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            String answer = ""+s.charAt(i);
            set.add(answer);
            for (int j = i+1; j < s.length(); j++){
                answer += s.charAt(j);
                set.add(answer);
            }
        }
        System.out.println(set.size());
    }
}