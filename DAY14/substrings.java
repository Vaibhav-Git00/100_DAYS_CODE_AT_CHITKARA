

public class substrings {
    public static String subsrii(String str,int si,int ei){
        String subst= "";
        for(int i=si;i<ei;i++){
            subst+=str.charAt(i);
        }
        return subst;
    }
    public static void main(String[] args) {
        String str="helloworld";
        System.out.println(str.substring(0,5));   //substring function
        System.out.println(subsrii(str, 2, 5));    //by default 0 se hi string start hoti haiiii
    }
}
