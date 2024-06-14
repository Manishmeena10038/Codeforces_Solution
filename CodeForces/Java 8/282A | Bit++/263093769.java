import java.util.Scanner;
 
public class bitpp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        int i =0;
        int ans =0;
        while(i<n){
            String s = sc.next();
            str[i] = s;
            i++;
 
        }
        i=0;
        while (i < n) {
            if (str[i].equals("X++") || str[i].equals("++X")) {
                ans++;
            } else if (str[i].equals("X--") || str[i].equals("--X")) {
                ans--;
            }
            i++;
        }
        System.out.println(ans);
    }
}