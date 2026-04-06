public class ArrayExercises {
    public static void main(String[] args){

        //Task 1: firstLast6
        int[] firstArray= {1,2,6};
        System.out.println(firstLast6(firstArray));
        int[] scoandArray= {1,2,6,5,8};
        System.out.println(firstLast6(scoandArray));
    }

    //Task 1: firstLast6
    public static boolean firstLast6(int nums[]){
        if(nums[0]==6 || nums[nums.length-1]==6){
            return true;
        }else
        {
            return false;
        }
    }
}
