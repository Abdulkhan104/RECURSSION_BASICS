public class Recurssion{


    public static void printStack(int n){

        if(n==10){
            System.out.println("This is sop  ::"+ n);
            return ;
        }
        System.out.println("This is RECURR ::"+ n);
        printStack(n+1);
    }

    public static int printFactorialofNumber(int num){

        if(0 == num){
            return 1;
        }


        int factNumber1 = printFactorialofNumber(num-1);
        int fun = num * printFactorialofNumber(num-1);
        return fun;
    }

    public static int sumofNaturalNum(int n){
        if(n==0){
            return 0;
        }
        int Snm1 = sumofNaturalNum(n-1);
        int fun = n + sumofNaturalNum(n-1);
        return fun;
    }

    public static int fibonacchi_Num(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib_nm1 = fibonacchi_Num(n-1);
        int fib_nm2 = fibonacchi_Num(n-2);
        return fib_nm1+fib_nm2;
    }
    public static void main(String[] args) {
        // printStack(0);


        //Factorial_with_the_Recurssion
        //int num = 5;
        //System.out.println(printFactorialofNumber(5));


        //SUMof"N" natural numbers_with_the_Recurssion
        // int num = 5;
        //System.out.println(sumofNaturalNum(num));

        //Fibonacci_with_the_Recurssion
        int num = 5;
        System.out.println(fibonacchi_Num(num));


    }
}