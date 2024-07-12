import java.util.*;

public class break_questions {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        do{
            System.out.print("enter the numbers: ");
            int num=sc.nextInt();
            if(num%10==0){
                break;
            }
            
            System.out.println(num);
        }while(true);
        System.out.println("i am the outside of the loop");
        sc.close();
    }
}
