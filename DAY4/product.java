import java.util.*;
public class product {
    public static  int prod(int a,int b ){
        int result=a*b;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int prod= prod(num1,num2);
        System.out.println(prod);
        sc.close();
    }
}
