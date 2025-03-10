public class AD_problem{

    public static int TiningProblem(int n){

        if(n == 0 || n == 1){
            return 1;
        }
        int fnm1 = TiningProblem(n-1);
        int fnm2 = TiningProblem(n-2);
        return fnm1 + fnm2;
        }


    public static void main(String[] args) {
        int n = 4;
        System.out.println(TiningProblem(n));
    }
}