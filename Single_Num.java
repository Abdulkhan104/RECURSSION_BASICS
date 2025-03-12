public class Single_Num{


    public static int SingleNumber(int nums[]){
    
        int result = 0;
        
        for(int i=0;i<nums.length;i++){
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1,4,6,2,1,6,4};
        System.out.println(SingleNumber(nums));
    }
}