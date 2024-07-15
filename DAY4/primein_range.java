import java.util.*;
public class primein_range {

    public static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void isrange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        isrange(a);
        sc.close();
    }
    
}