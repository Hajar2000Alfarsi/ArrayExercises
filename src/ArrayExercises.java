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
       /* System.out.println("Task 4: middleWay ");
        int[] midlleWay1 = {1,2,3};
        int[] midlleWay2 = {4,5,6};
        System.out.println(Arrays.toString(middleWay(midlleWay1,midlleWay2)));

        */

        //Task 5: no23
        /*System.out.println("Task 5: no23 ");
        int[] array1 = {1,2};
        System.out.println(no23(array1));
        int[] array2 = {4,5};
        System.out.println(no23(array2));*/

        //Task 6: fix23
        /*System.out.println("Task 6: fix23");
        int[] fix23Array = {2,3,5};
        System.out.println(Arrays.toString(fix23(fix23Array)));*/

        //Task 7: makeMiddle
       /* System.out.println("Task 7: makeMiddle");
        int[] makeMiddleArray = {2,3,5,8};
        System.out.println(Arrays.toString(makeMiddle(makeMiddleArray)));*/

        //Task 8: midThree
        /*System.out.println("Task 8: midThree");
        int[] midThreeArray = {2,3,5,8,6};
        System.out.println(Arrays.toString(midThree(midThreeArray)));*/

        //Task 9: unlucky1
        /*System.out.println("Task 9: unlucky1");
        int[] unlucky1Array = {2,1,3,6,3};
        System.out.println(unlucky1(unlucky1Array));
        int[] unlucky1Array1 = {2,1,7,6,3};
        System.out.println(unlucky1(unlucky1Array1));*/

        //Task 10: sameFirstLast
        /*System.out.println("Task 10: sameFirstLast");
        int[] sameFirstLastArray = {2,1,3,6,2};
        System.out.println(sameFirstLast(sameFirstLastArray));
        int[] sameFirstLastArray1 = {2,7,4,5,6};
        System.out.println(sameFirstLast(sameFirstLastArray1));*/

        //Task 11: maxEnd3
        /*System.out.println("Task 11: maxEnd3");
        int[] maxEnd3Array = {11,2,3};
        System.out.println(Arrays.toString(maxEnd3(maxEnd3Array)));*/

        //Task 12: makeEnds
        /*System.out.println("Task 12: makeEnds");
        int[] makeEndsArray = {11,2,3};
        System.out.println(Arrays.toString(makeEnds(makeEndsArray)));*/

        //Task 13: makeLast
        /*System.out.println("Task 12: makeEnds");
        int[] makeLastArray = {11,2,3};
        System.out.println(Arrays.toString(makeLast(makeLastArray)));*/

        //Task 14: start1
        /*System.out.println("Task 14: start1");
        int[] startArray1 = {1,2,3};
        int[] startArray2 = {};
        System.out.println(start1(startArray1,startArray2));*/

        //Task 15: plusTwo
        /*System.out.println("Task 15: plusTwo ");
        int[] plusTwoArray1 = {1,2};
        int[] plusTwoArray2 = {3,4};
        System.out.println(Arrays.toString(plusTwo(plusTwoArray1,plusTwoArray2)));*/

        //Task 16: maxTriple
        /*System.out.println("Task 16: maxTriple");
        int[] maxTripleArray1 = {1,2,5,9,4};
        System.out.println(maxTriple(maxTripleArray1));*/

        //Task 17: make2
        /*System.out.println("Task 17: make2");
        int[] make2Array1 = {};
        int[] make2Array2 = {3,4,4};
        System.out.println(Arrays.toString(make2(make2Array1,make2Array2)));*/

        //Task 18: makePi
        /*System.out.println("Task 18: makePi");
        System.out.println("PI=" + Arrays.toString(makePi()));*/

        //Task 19: rotateLeft3
        /*System.out.println("Task 19: rotateLeft3");
        int[] rotateLeft3Array = {1,2,3};
        System.out.println(Arrays.toString(rotateLeft3(rotateLeft3Array)));*/

        //Task 20: sum2
        /*System.out.println("Task 20: sum2");
        int[] sum2Array = {1,9,3};
        System.out.println(sum2(sum2Array));*/

        //Task 21: has23
        /*System.out.println("Task 21: has23");
        int[] has23Array = {3,3};
        System.out.println(has23(has23Array));*/

        //Task 22: double23
        /*System.out.println("Task 22: double23");
        int[] double23Array = {3,2};
        System.out.println(double23(double23Array));*/

        //Task 23: biggerTwo
        /*System.out.println("Task 23: biggerTwo");
        int[] biggerTwoArray1 = {1,2};
        int[] biggerTwoArray2 = {1,9};
        System.out.println(Arrays.toString(biggerTwo(biggerTwoArray1,biggerTwoArray2)));*/

        //Task 24: swapEnds
        /*System.out.println("Task 24: swapEnds");
        int[] swapEndsArray = {3,2,5,5,8};
        System.out.println(Arrays.toString(swapEnds(swapEndsArray)));*/

        //Task 25: frontPiece
        System.out.println("Task 25: frontPiece");
        int[] frontPieceArray = {3,2,5,5,8};
        System.out.println(Arrays.toString(frontPiece(frontPieceArray)));
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

    //Task 5: no23
    public static boolean no23(int[] arr){
        if(arr[0]!=2 && arr[0]!=3 && arr[1]!=2 && arr[1]!=3){
            return true;
        }else {
            return false;
        }

    }

    //Task 6: fix23
    public static int[] fix23(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2 && arr[i+1]==3){
                arr[i+1]=0;
            }
        }
        return arr;
    }

    //Task 7: makeMiddle
    public static int[] makeMiddle(int[] arr){
        int middlepoint=arr.length/2;
        int [] result={arr[middlepoint-1],arr[middlepoint]};
        return result;
    }

    //Task 8: midThree
    public static int[] midThree(int[] arr){
        int middlepoint=arr.length/2;
        int[] result={arr[middlepoint-1],arr[middlepoint],arr[middlepoint+1]};
        return result;
    }

    //Task 9: unlucky1
    public static boolean unlucky1(int[] arr){
        if(arr[0]==1 && arr[1]==3 || arr[1]==1 && arr[2]==3){
            return true;
        }
        else {
            return false;
        }
    }

    //Task 10: sameFirstLast
    public static boolean sameFirstLast(int[] arr){
        if(arr.length>=1 && arr[0]==arr[arr.length-1]){
            return true;
        }else {
            return false;
        }
    }

    //Task 11: maxEnd3
    public static int[] maxEnd3(int[] arr){
        int[] result=new int[3];
        if(arr[0]>arr[2]){
            for(int i=0;i<3;i++){
                result[i]=arr[0];
            }
            }else if(arr[0]<arr[2]) {
            for(int i=0;i<3;i++){
                result[i]=arr[2];
            }
            }
        return result;
    }

    //Task 12: makeEnds
    public static int[] makeEnds(int[] arr){
        int[] result={arr[0],arr[arr.length-1]};
        return result;
    }

    //Task 13: makeLast
    public static int[] makeLast(int[] arr){
        int doubleLength= arr.length*2;
        int[] result=new int[doubleLength];
        for(int i=1;i<result.length-2;i++){
            result[i]=0;
        }
        result[result.length-1]=arr[arr.length-1];
        return result;
    }

    //Task 14: start1
    public static int start1(int[] arr1,int[] arr2){
        int count=0;
        if(arr1.length>0 && arr1[0]==1){
            count++;
        }
        if(arr2.length>0 && arr2[0]==1){
            count++;
        }
        return count;
    }

    //Task 15: plusTwo
    public static int[] plusTwo(int[] arr1,int[] arr2){
        int[] result= {arr1[0],arr1[1],arr2[0],arr2[1]};
        return result;
    }

    //Task 16: maxTriple
    public static int maxTriple(int[] arr){
            int first=arr[0];
            int middle=arr[arr.length/2];
            int last=arr[arr.length-1];
            return Math.max(first,Math.max(middle,last));
    }

    //Task 17: make2
    public static int[] make2(int[] arr1,int[] arr2){
        int[] result=new int[2];
        if(arr1.length==2){
            result[0]=arr1[0];
            result[1]=arr1[1];
        }else if(arr1.length==1){
            result[0]=arr1[0];
            result[1]=arr2[0];
        }else if(arr1.length==0){
            result[0]=arr2[0];
            result[1]=arr2[1];
        }
        return result;
    }

    //Task 18: makePi
    public static int[] makePi(){
        int[] pi={3,1,4};
        return pi;
    }

    //Task 19: rotateLeft3
    public static int[] rotateLeft3(int[] arr){
        int[] result={arr[1],arr[2],arr[0]};
        return result;
    }

    //sum2
    public static int sum2(int[] arr){
        int sum=0;
        for(int i=0;i<2;i++){
            sum += arr[i];
        }
        return sum;
    }

    //Task 21: has23
    public static boolean has23(int[] arr){
        boolean has2or3=false;
        for(int i=0;i<2;i++){
            if(arr[i]==2 || arr[i]==3){
                has2or3= true;
            }
            else{
                has2or3= false;
            }
        }
        return has2or3;
    }

    //Task 22: double23
    public static boolean double23(int[] arr){
        boolean twice=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==2 && arr[i+1]==2 || arr[i]==3 && arr[i+1]==3){
                twice=true;
            }else{
                twice=false;
            }
        }
        return twice;
    }

    //Task 23: biggerTwo
    public static int[] biggerTwo(int[] arr1,int[] arr2){
        int sum1=arr1[0]+arr1[1];
        int sum2=arr2[0]+arr2[1];
        if(sum1>=sum2){
            return arr1;
        }else {
            return arr2;
        }
    }

    //Task 24: swapEnds
    public static int[] swapEnds(int[] arr){
        int[] result=new int[arr.length];
        result[0]=arr[arr.length-1];
        result[result.length-1]=arr[0];
        for(int i=1; i<arr.length-1;i++){
            result[i]=arr[i];
        }
        return result;
    }

    //Task 25: frontPiece
    public static int[] frontPiece(int[] arr){
        int[] result=new int[2];
        if(arr.length<2){
            return arr;
        }else if(arr.length>=2){
            result[0]=arr[0];
            result[1]=arr[1];
        }
        return result;
    }

}
