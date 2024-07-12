
import java.util.*;
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number: ");
        int num= sc.nextInt();
        int even_sum=0;
        int odd_sum=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                even_sum+=i;
            }
            else {
                odd_sum+=i;
            }
        }
        System.out.println(even_sum);
        System.out.println(odd_sum);

    }
}
