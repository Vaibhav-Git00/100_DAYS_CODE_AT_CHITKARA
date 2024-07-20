//prefix sum optimise method
//time complexity 0(2n)

public class maxsubarray2 {
    public static void maxsub(int arr[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        int prefix[]= new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                sum= start == 0 ? prefix[end]: prefix[end]- prefix[start-1];
                if(max<sum){
                    max=sum;
                }
            }
        }
        System.out.println("the sub max is:"+max);
    }
    public static void main(String[] args) {
        int n[]={1,2,3,4,55,6};
        maxsub(n);
        
    }
}
