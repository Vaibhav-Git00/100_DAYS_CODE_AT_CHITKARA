//divide and conquer

public class merge_sort {
    public static void mergesort(int arr[],int si,int ei){
       int mid=si+(ei-si)/2;
       mergesort(arr, si, mid);
       mergesort(arr, mid+1, ei);


    }

        public static void main(String[] args) {
        
    }
}
