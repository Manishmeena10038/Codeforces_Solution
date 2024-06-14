import java.util.*;
public class beautifulyear{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int year = sc.nextInt();
        // System.out.println(year);
        boolean b = false;
        while(b!=true){
            b = check(year++);
        }
        System.out.println(year);
        
    }
    public static boolean check(int n){
       
            int[] arr = new int[10];
            int k = n+1;
            while(k>0){
                int rem = k%10;
                 k = k/10;
                 if(arr[rem]==1) return false;
                 else arr[rem]=1;
            }
            return true;
        }
    }