
import java.util.*;
public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit + " ");
            n=n/10;
        }
        System.out.println();
        sc.close();
    }
}

