public class goodtripllets{
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n=arr.length;
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a = 7, b = 2, c = 3;
        int arr[]={3,0,1,1,9,7};
        System.out.println(countGoodTriplets(arr, a, b, c));
    }
}