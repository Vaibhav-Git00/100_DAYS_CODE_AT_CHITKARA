import java.util.Scanner;

public class checkprime {
    public static void is_prime(int a){
        int isprime=1;
        for(int i=2;i<a-1;i++){
            if(a%i==0){
                isprime=0;
            }
        }
        if(isprime==1){
            System.out.println("this is prime");
        }
        else{
            System.out.println("this is not a prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        is_prime(num);
        sc.close();
    }
}
