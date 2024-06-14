import java.util.Scanner;
 
public class longwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i] = sc.next();
 
        }
        for(String st: str){
            if(st.length()<=10){
                System.out.println(st);
            }
            else{
                int k = st.length()-2;
 
                System.out.println(st.charAt(0)+""+k+""+st.charAt(k+1));
            }
        }
    }
}