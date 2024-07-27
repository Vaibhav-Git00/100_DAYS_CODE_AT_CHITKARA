public class convTo_uppercase {

    public static String uppercase(String str){
        StringBuilder sb=new StringBuilder();

        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){     //2nd case is liye laga hai ,ki input ka last wala empty na utha lee , i mean empty space ke baad koi character hona chahiye//
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String strr="my name is vaibhav kesharwani ";
        System.out.println(uppercase(strr));
    }
}
 