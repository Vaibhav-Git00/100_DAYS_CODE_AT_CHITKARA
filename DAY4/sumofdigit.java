import java.util.Scanner;

public class sumofdigit {
    public static int sumofdi(int n){
        int sum=0;
        while (n>0) {
            int last_digit=n%10;
            sum=sum+last_digit;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumofdi(n));
        sc.close();
        
    }
}
