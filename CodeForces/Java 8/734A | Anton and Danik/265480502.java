import java.util.Scanner;
 
public class antondanik {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int anton =0;
        int danik = 0;
        for(char c:s.toCharArray()){
            if(c=='A') anton++;
            else danik++;
        }
        if(anton==danik){
            System.out.println("Friendship");
        }
        else if(anton<danik) System.out.println("Danik");
        else System.out.println("Anton");
    }
}