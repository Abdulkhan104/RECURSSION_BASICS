public class AD_problem{

    public static int TiningProblem(int n){

        if(n == 0 || n == 1){
            return 1;
        }
        int fnm1 = TiningProblem(n-1);
        int fnm2 = TiningProblem(n-2);
        return fnm1 + fnm2;
        }


        public static int friendproblem(int n){
            if(n == 0 || n == 1){return 1; }
            return TiningProblem(n-1)+(n-1)*TiningProblem(n-2);
            }


    public static void main(String[] args) {
        int n = 3;
      //  System.out.println(TiningProblem(n));
        System.out.println(friendproblem(n));
    }
}