import java.util.Arrays;
public class ArrayExercises {

    public static void main(String[] args){

        //Task 1: firstLast6
        /*System.out.println("Task 1: firstLast6");
        int[] firstArray= {1,2,6};
        System.out.println(firstLast6(firstArray));
        int[] scondArray= {1,2,6,5,8};
        System.out.println(firstLast6(scondArray));
*/

        //Task 2: commonEnd
        /*System.out.println("Task 2: commonEnd ");
        int[] arr1= {1,2,6};
        int[] arr2= {1,2,6,5,8};
        System.out.println(commonEnd(arr1,arr2));*/

        //Task 3: reverse3
        /*System.out.println("Task 3: reverse3 ");
        int[] reverseArray= {1,2,6};
        reverse3(reverseArray);*/

        //Task 4: middleWay
        System.out.println("Task 4: middleWay ");
        int[] midlleWay1 = {1,2,3};
        int[] midlleWay2 = {4,5,6};
        System.out.println(Arrays.toString(middleWay(midlleWay1,midlleWay2)));
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

    //Task 2: commonEnd
    public static boolean commonEnd(int[] num1,int[] num2){
        if((num1[0]==num2[0])||(num1[num1.length-1]==num2[num2.length-1])){
            return true;
        }else {
            return false;
        }
    }

    //Task 3: reverse3
    public static void reverse3(int[] nums){
        int[] result ={nums[2],nums[1],nums[0]};
        System.out.println(Arrays.toString(result));
    }

    //Task 4: middleWay
    public static int[] middleWay(int[] ar1,int[] ar2){
        int [] result={ar1[1],ar2[1]};
        return result;
    }
}
