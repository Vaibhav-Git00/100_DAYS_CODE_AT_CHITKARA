

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
        int num[]={45,78,43,24,78,8};
        reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();
    }
}
