import java.util.Scanner;

public class bionomial_cofficient {
    public static int fact(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();
        int a= fact(n);
        int b= fact(r);
        int c= fact(n-r);
        int bio=a/(b*c);
        System.out.println(bio);
        sc.close();
    }
}
