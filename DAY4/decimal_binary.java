import java.util.*;
public class decimal_binary {
    public static void isdecimal(int n){
        int mynum=n;
        int bin=0;
        int pow=0;
        while (n>0) {
            int rem=n%2;
            bin=bin+(rem*(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("decimal value of"+ mynum +" is = "+bin);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isdecimal(n);
        sc.close();
    }
}
