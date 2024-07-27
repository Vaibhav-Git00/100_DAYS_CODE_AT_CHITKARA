
public class string_compression {
    public static String compress(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            Integer count=1;  //yaha pr ham bade integer ka isliye use kiye hai kyuki hame integer ko string banana tha toh isliye ham integer ko uski class me likhe haii
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String srr="aaabbcddd";
        System.out.println(compress(srr));
        
        
        
    }
}

//note jab bhi ham stringbuilder ka use krte hai toh ham waha char ko append ki help se dalte haiii
