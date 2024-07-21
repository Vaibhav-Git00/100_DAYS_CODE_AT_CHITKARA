//Brute force method means simple logic based.
//time complexity 0(3n)
// public class maxsubArray {
    // public static int  sub(int arr[]){
    //     int sum=0;
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i;j<arr.length;j++){
    //             sum=0;
    //             for(int k=i;k<=j;k++){
    //                 sum+=arr[k];
    //                 max=Math.max(sum, max);
    //             }
    //         }
    //     }
    //     return max;
    // }

    //for better approach 0(2n)
    // public static int  sub(int arr[]){
    //     int sum=0;
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         sum=0;
    //         for(int j=i;j<arr.length;j++){
    //             sum+=arr[j];
    //             max=Math.max(sum, max);
    //         }
    //     }
    //     return max;

    
//time complexity 0(n)
//space complexity 0(1)


public class maxsubArray {
    public static int sub(int[] arr) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        if(max<0){
            for(int i=0;i<arr.length;i++){
                max=Math.max(max,arr[i]);
            }
        }
        return max;
}
    public static void main(String[] args) {
        int n[]={1,2,3,4,5};
        System.out.println(sub(n));
        
    }
}
