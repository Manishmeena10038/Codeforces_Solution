import java.util.Scanner;
 
public class luckynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt =0;
        while(n>0){
            long num = n%10;
            if(num==4||num==7) cnt++;
            n = n/10;
        }
        if(cnt==4||cnt==7) System.out.println("YES");
        else System.out.println("NO");
    }
}