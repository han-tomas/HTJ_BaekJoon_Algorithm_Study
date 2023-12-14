import java.util.*;
public class Main {

	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		Map<String, Integer> map1 = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<>();
		for (int i = 1; i <= N; i++) {
			String input = scan.next();
			map1.put(input, i);
			map2.put(i, input);
		}
		for(int i = 0; i < M; i++) {
			String s = scan.next();
			if(Character.isDigit(s.charAt(0))) {
				System.out.println(map2.get(Integer.parseInt(s)));
			}
			else
				System.out.println(map1.get(s));
		}
	}

}
