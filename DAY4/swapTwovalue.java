import java.util.Scanner;

public class swapTwovalue {
    public static void swap(int a,int b){
        int temp= a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap (a,b);
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}
