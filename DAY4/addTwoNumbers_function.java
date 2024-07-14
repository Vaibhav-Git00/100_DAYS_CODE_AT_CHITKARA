//void type 

// import java.util.*;
// public class addTwoNumbers_function {
//     public static void sum(int a ,int b){
//         int result =a+b;
//         System.out.println("the sum is ="+ result);

//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num1=sc.nextInt();
//         int num2=sc.nextInt();
//         sum(num1,num2);
//         sc.close();
//     }
// }



//return type 

import java.util.*;
public class addTwoNumbers_function {
    public static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();   
        int b=sc.nextInt();
        int sum=sum(a,b);
        System.out.println("sum is = "+ sum);   
        sc.close();
    }
}