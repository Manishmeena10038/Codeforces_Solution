import java.util.Scanner;
 
public class beautifulmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int irow =0;
        int jcol = 0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int k = sc.nextInt();
                if(k==1){
                    irow =i;
                    jcol =j;
                    
                }
            }
        }
        irow = Math.abs(irow-2);
        jcol = Math.abs(jcol-2);
        System.out.println(irow+jcol);
    }
}