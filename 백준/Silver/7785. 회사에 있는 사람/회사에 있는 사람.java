import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String,String> map = new HashMap<String,String>();
        for(int i = 0 ; i < N ; i ++ ){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            if(map.containsKey(name)){
                map.remove(name);
            }else{
                map.put(name,state);
            }
        }
        List<String> list = new ArrayList<String>(map.keySet());
        Collections.sort(list,Collections.reverseOrder());
        for(String s : list){
            System.out.println(s);
        }
    }
}