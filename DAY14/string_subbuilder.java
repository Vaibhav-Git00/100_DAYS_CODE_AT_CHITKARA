public class string_subbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        for(char i='a';i<='z';i++){
            sb.append(i);    //sb is a that string those who are working as a mutable string and ek ek character ko add kerne ke liyre append ka use krte haiiii
        }
        System.out.println(sb); 
        System.out.println(sb.length());
    }

    
}
