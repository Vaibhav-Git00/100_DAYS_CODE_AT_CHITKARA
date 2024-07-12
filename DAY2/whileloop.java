
import java.util.*;
public class whileloop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      
        // int n=1;
        // while (n<=10) {
        //     System.out.println(n);
        //     n++;
        // } 
        int n= sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print(i + " ");
            i++;
        }
        sc.close();
    }
}
