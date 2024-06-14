import java.util.Scanner;
 
public class football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max=0;
        int one =0;
        int zero =0;
        boolean flag= false;
 
        for(char c: s.toCharArray()){
            
            if(c=='1'){
                one++;
                zero =0;
            }
            else{
                zero++;
                one =0;
            }
            if(one>=7||zero>=7){
                
                System.out.println("YES");
                flag = true;
                break;
          }
        }
        if(!flag)System.out.println("NO");
 
    }
}