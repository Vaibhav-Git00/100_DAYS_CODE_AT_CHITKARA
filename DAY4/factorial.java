import java.util.*;
public class factorial {
    public static int fact(int a){
        int factt=1;
        for(int i=1;i<=a;i++){
            factt=factt*i;
        }
        return factt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(fact(num));
        sc.close();
    }
}
