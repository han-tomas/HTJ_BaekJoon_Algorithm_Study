import java.util.*;

public class Main{
    public long gcd(long a, long b){
        while(b != 0){
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    
    public void lcd(long a, long b){
        System.out.println(a * b / gcd(a, b));
    }
    
    
    public static void main(String[] args){
        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        T.lcd(a, b);
    }
}