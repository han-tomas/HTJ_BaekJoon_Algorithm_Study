import java.util.*;


public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();
        for (int i = 0; i < N; i++){
            set1.add(scan.next());
        }
        int count = 0;
        for (int i = 0; i < M; i++){
            String s = scan.next();
            if(set1.contains(s)){
                set2.add(s);
            } 
        }
        System.out.println(set2.size());
        for (String s : set2){
            System.out.println(s);
        }
    }
}