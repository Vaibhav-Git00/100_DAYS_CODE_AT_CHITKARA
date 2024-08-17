
public class subset {
    public static void findsubset(String str,int i,String ans){
        if(i==str.length()){
            if(str.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
                return;
            }
        }
        findsubset(str, i+1, ans+str.charAt(i));
        findsubset(str, i+1, ans);
    }
    public static void main(String[] args) {
        String str="abc";
        findsubset(str, 0, "");
    }    
}
