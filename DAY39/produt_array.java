//Product of Array Except Self

public class produt_array {
        public static int[] productExceptSelf(int[] nums) {
            int n=nums.length;
            int arr[]= new int[n];
            for(int i=0;i<n;i++){
                int product=1;
                for(int j=0;j<n;j++){
                    if(i==j) continue;
                    product *=nums[j];
                }
                arr[i]=product;
            }
            return arr;
    
        }
        public static void printll(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
        public static void main(String[] args) {
            int arr[]={1,2,3,4};
            int result[]=productExceptSelf(arr);
            printll(result);
        }
    
}
