import java.util.Scanner;
 
public class height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int cnt = 0;
        for(int i=0;i<n;i++){
            int l = sc.nextInt();
            if(l<=h)cnt+=1;
            else cnt+=2;
            
        }
        System.out.println(cnt);
    }
}