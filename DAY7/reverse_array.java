import java.util.Scanner;

public class reverse_array {
    public static int reverse(int arr[]){
        int start=0,end=arr.length-1;
        while (start<end) {
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
            
        }
        return -1;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }

        reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();
        sc.close();
    }
}
