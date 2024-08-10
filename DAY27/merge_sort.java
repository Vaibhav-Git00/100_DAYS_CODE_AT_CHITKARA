//divide and conquer

public class merge_sort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return ;
        }
       int mid=si+(ei-si)/2;
       mergesort(arr, si, mid);
       mergesort(arr, mid+1, ei);
       merger(arr, si,mid, ei);
    }
    public static void merger(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si; //index for first sorted array
        int j=mid+1;    //index for second sorted array
        int k=0;   //index for temp sorted array

        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
            //for leftover part of 1st sorted part
            while (i<=mid) {
                temp[k++]=arr[i++];
                
            }
            //for leftover part of 2nd sorted part
            while (j<=ei) {
                temp[k++]=arr[j++];
                
            }
            //copy temp to ariginal value
            for(k=0,i=si;k<temp.length;k++,i++){
                arr[i]=temp[k];
            }        
    }

        public static void main(String[] args) {
        int arr[]={6,3,5,2,7,8,9};
        mergesort(arr, 0, arr.length-1);
        print(arr);
    }
}
