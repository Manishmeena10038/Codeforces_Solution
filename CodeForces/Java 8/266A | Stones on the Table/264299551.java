import java.util.Scanner;
 
public class stonesonthepool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int cnt =0;
        for(int i =1;i<n;i++){
            if(str.charAt(i)==str.charAt(i-1)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}