import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class validstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Character> arr = new ArrayList<>();
        for(char c: s.toCharArray()){
            if(c!='+'){
                arr.add(c);
            }
        }
        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.size()-1;i++){
            sb.append(arr.get(i));
            sb.append('+');
        }
        sb.append(arr.get(arr.size()-1));
        System.out.println(sb);
    }
}