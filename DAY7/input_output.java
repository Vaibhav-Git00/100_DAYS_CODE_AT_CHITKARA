import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        int arr[]= new int[100];
        Scanner sc= new Scanner(System.in);
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        System.out.println("marks of 1:"+ arr[0]);
        System.out.println("marks of 2:"+ arr[1]);
        System.out.println("marks of 3:"+ arr[2]);
        System.out.println(arr.length);
        sc.close();
    }

    
    
}
