

public class binary_search {
    public static int binary(int num[],int key){
        int start=0,end=num.length-1;
        while (start<=end) {
            int mid=(start+end)/2;

            if(num[mid]==key){
                return mid;
            }
            else if(key>num[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={45,45,7,89,90,24};
        int key=900;
        System.out.println(binary(arr,key));
    }
}
