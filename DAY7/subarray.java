public class subarray {
    public static void sub(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end =j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]);
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray is :"+ts);
    }
    public static void main(String[] args) {
        int n[]={1,3,5,6,7};
        sub(n);
    }
}
