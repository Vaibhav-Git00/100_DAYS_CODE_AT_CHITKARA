

public class string {
    public static void lettersprint(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");     //charAt means character at index , agar character ki har index ki value print karani ho
        }
        System.out.println();

    }
    
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);     // string are immutable
        // String name=sc.nextLine();
        // String kaa=sc.next();
        // System.out.println(name);
        // System.out.println(kaa);
        // sc.close();

        // String name="vaibjav kdjoejjs";
        // System.out.println(name.length()); ////string ki length nikalne la function


        String firstletter="vaibhav";
        String secondletter="kesharwani";
        String combine=firstletter + " " + secondletter;    //concanating of two string with the help of '+'.
        // System.out.println(combine);
        
        lettersprint(combine);
        
        
    }
   
}
