import java.util.Scanner;
 
public class bigbro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();
        int bb = sc.nextInt();
        int i=0;
        while(sb<=bb){
            i++;
            sb= 3*sb;
            bb = 2*bb;
        }
        System.out.println(i);
    }
}