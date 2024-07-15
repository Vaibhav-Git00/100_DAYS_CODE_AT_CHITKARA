import java.util.*;
public class binary_to_decimal {

    public static void binaryy(int n){
        int mynum=n;
        int pow=0;
        int dec=0;
        while (n>0) {
            int last_digit=n%10;
            dec=dec+(last_digit * (int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        System.out.println("decimal value of "+ mynum+" is : "+ dec);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        binaryy(n);
        sc.close();
    }
}
