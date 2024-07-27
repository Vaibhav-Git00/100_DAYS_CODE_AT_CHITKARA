public class count_lowervowels {
    public static void lowervowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String sen="vaibhav";
        // System.out.println(lowervowels(sen));
        lowervowels(sen);
    }
}
//note:- jaha par bhi string me print karana ho waha pr syntax hamara void nhi string hoga ,aur uss jagah int ko tostring me convert krna hoga 
//and int value print krana ho toh waaha ham void ka use karengee