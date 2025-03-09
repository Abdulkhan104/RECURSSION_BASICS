public class Recurssion{


    public static void printStack(int n){

        if(n==10){
            System.out.println("This is sop  ::"+ n);
            return ;
        }
        System.out.println("This is RECURR ::"+ n);
        printStack(n+1);
    }

    public static void main(String[] args) {
        printStack(0);
    }
}