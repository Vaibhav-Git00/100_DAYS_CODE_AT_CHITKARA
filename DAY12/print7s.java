import java.util.Scanner;

public class print7s {
    public static int print(int arr[][],int key){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int find=sc.nextInt();
        System.out.println("The number " + find + " appears " + print(arr, find) + " times in the array.");
        sc.close();
    }
}
