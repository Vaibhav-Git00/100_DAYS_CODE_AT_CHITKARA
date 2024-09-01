public class Shuffle_String {
    public static String restoreString(String s, int[] indices) {
        int l=indices.length;
        String suffle[]=new String[l];
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<l;i++){
            suffle[indices[i]]=String.valueOf(s.charAt(i));  
        }

        for(String str : suffle){
            ans.append(str);     
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s="codeleet";
        int arr[]={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, arr));

    }
}
