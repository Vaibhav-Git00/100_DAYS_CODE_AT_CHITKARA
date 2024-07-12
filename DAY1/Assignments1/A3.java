
import java.util.*;
public class A3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            System.out.println("negative number");
        }
        else if(num==0){
            System.out.println("num is zero");
        }
        else{
            System.out.println("positive");
        }
        sc.close();
    }
}
