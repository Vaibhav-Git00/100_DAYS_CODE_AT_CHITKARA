public class first_occurance {
    public static int first(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,3,23,5};
        System.out.println(first(arr, 11, 0));
    }
}
