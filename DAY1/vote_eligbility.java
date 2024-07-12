public class vote_eligbility {
    public static void main(String[] args) {
        int age =18;
        if(age>=18){
            System.out.println("you are eligible for vote");
        }
        else if(age>=14 && age<18){
            System.out.println("teenager");

        }
        else{
            System.out.println("you are a child");
        }
    }
}
