

public class equal {
    public static void main(String[] args) {
        String name="vaibhav";
        String name1="vaibhav";
        String name2=new String("vaibhav");
        if(name==name1){
            System.out.println("these are equal");
        }
        if(name.equals(name2)){     //equal functions is use only when a one string to another new string .
            System.out.println("these are equal");
        }
        else{
            System.out.println("these are not eqyal");
        }
    }
}
