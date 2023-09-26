import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double total = 0.0;
        double tscore = 0.0;
        for(int i = 0;  i<20 ; i++)
        {
            String[] input = br.readLine().split(" ");
            double score = Double.parseDouble(input[1]);
            String grade = input[2];
            double igrade= 0.0;
            switch(grade){
                case "A+":
                    igrade = 4.5;
                    total +=(score*igrade);
                    tscore +=score;
                    break;
                case "A0":
                    igrade = 4.0;
                    total +=(score*igrade);
                    tscore +=score;
                    break;
                case "B+":
                    igrade = 3.5;
                    total +=(score*igrade);
                    tscore +=score;
                    break;
                case "B0":
                    igrade = 3.0;
                    total +=(score*igrade);
                    tscore +=score;
                    break;
                case "C+":
                    igrade = 2.5;
                    total +=(score*igrade);
                    tscore +=score;
                    break;
                case "C0":
                    igrade = 2.0;
                    total +=(score*igrade);
                    tscore +=score;
                    break;
                case "D+":
                    igrade = 1.5;
                    total +=(score*igrade);
                    tscore +=score;
                    break;
                case "D0":
                    igrade = 1.0;
                    total +=(score*igrade);
                    tscore +=score;
                    break;
                case "F":
                    igrade = 0.0;
                    total +=(score*igrade);
                    tscore +=score;
                    break;
                case "P":
                    break;    
            }
        }
        System.out.println(total/tscore);
    }
}