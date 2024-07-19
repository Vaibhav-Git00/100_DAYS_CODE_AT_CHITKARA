import java.util.Scanner;

public class pairs_array {
    public static void pairs(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            int present=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("( "+present +","+ arr[j]+" ) ");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        pairs(arr);
        sc.close();
    }
}
