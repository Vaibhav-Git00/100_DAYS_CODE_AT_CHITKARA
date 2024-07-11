import java.util.*;
public class type_promotion {
    public static void main(String[] args) {
        // byte a= 2;
        // short b =4;
        // char c='a';
        // int sum  = a + b + c;
        // byte result = (byte)sum;
        // System.out.println(sum);
        long a=56;
        float b= 23.89f;
        double c = 987.00;
        long sum= (long)(a+b+c);
        System.out.println(sum);
        
    }
}
