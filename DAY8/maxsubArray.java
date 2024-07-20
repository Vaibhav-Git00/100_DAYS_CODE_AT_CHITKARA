//Brute force method means simple logic based.


public class maxsubArray {
    public static void sub(int arr[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end =j;
                sum=0;
                for(int k=start;k<=end;k++){
                    sum+=arr[k];
                }
                System.out.println(sum);
                if(max<sum){
                    max=sum;
                }
            }
            System.out.println();
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int n[]={1,2,3,4,5};
        sub(n);
    }
}
