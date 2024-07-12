import java.util.*;
public class A3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.print(num+ "*" + i + "=");
            System.out.println(num*i);
        }
        sc.close();
    }
}
