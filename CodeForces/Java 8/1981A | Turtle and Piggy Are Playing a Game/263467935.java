import java.util.Scanner;
 
public class contest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ans = new int[t];
 
        
        for(int k =0;k<t;k++){
            int l = sc.nextInt();
        int r = sc.nextInt();
        double p = l;
        int i=1;
           
            while(p<=r){
                p = Math.pow((double)2,(double)i);
                i++;
           }
           ans[k] = i-2;
        }
        for(int k=0;k<t;k++){
            System.out.println(ans[k]);
        }
        
    }
}