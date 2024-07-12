import java.util.*;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number: ");
        int n= sc.nextInt();

        boolean isprime= true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime==true){
            System.out.println("n is a prime number.");
        }
        else{
            System.out.println("n is not a prime number.");
        }
        sc.close();
    }
}
