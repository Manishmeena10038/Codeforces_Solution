import java.util.Scanner;
 
public class nextround {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt =0;
        int l =0;
        boolean flag  = false;
        
        for(int i=0;i<k;i++){
             l= sc.nextInt();
 
            if(l>0){
                flag =  true;
                cnt++;
            }
        }
        for(int i=k;i<n;i++){
            int j = sc.nextInt();
            if(j==l&&flag==true&&j>0){
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}