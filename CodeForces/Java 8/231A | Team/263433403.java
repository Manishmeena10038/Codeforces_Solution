import java.util.Scanner;
 
public class teamsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int curcnt=0;
        for(int i=0;i<n;i++){
            curcnt =0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==1){
                curcnt++;
            }
            if(b==1){
                curcnt++;
            }
            if(c==1){
                curcnt++;
            }
            if(curcnt>=2){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}