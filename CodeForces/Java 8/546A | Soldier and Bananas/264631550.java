import java.util.Scanner;
 
public class soldiersandbananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int sum = 0;
        while(w>0){
            sum = sum+w*k;
            w--;
        }
        sum = sum-n;
        if(sum>0){
            System.out.println(sum);
        }
        else System.out.println(0);
 
    }
}