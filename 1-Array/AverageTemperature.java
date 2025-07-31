import java.util.Arrays;
import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("How many day's temperature?");
        // int noOfDays = sc.nextInt();
        // int sum = 0;
        // int[] temp = new int[noOfDays];
        // for(int i=0;i<temp.length;i++){
        //     System.out.println("Enter the temperature of "+(i+1)+" day");
        //     temp[i] = sc.nextInt();
        //     sum += temp[i];
        // }
        // double avg = (double)sum/noOfDays;
        // System.out.println("Avg temp = "+avg);
        // int above=0;
        // for (int i = 0; i < temp.length; i++) {
        //     if(temp[i]>avg){
        //         above++;
        //     }
        // }
        // System.out.println(above+" No of days above average");

        // int[][] myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
        // System.out.println(sumDiagonalElements(myArray2D));

        // int[] arr = {4, 5, 3, 1, 2};

        // for (int i = 0; i < arr.length - 1; i++) {
        //     System.out.println("Pass " + (i + 1) + ":");
        //     for (int j = 0; j < arr.length - 1 - i; j++) {
        //         System.out.println("  Comparing " + arr[j] + " and " + arr[j + 1]);
        //         if (arr[j] > arr[j + 1]) {
        //             // Swap
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //             System.out.println("  Swapped → " + java.util.Arrays.toString(arr));
        //         } else {
        //             System.out.println("  No swap  → " + java.util.Arrays.toString(arr));
        //         }
        //     }
        //     System.out.println("After Pass " + (i + 1) + ": " + java.util.Arrays.toString(arr));
        //     System.out.println("--------------------------------------------------");
        // }

        // System.out.println("Final Sorted Array: " + java.util.Arrays.toString(arr));

        System.out.println(removeDuplicates(new int[]{1,1,2,3,3}));

    }
     public static int sumDiagonalElements(int[][] array) {
         if(array.length!=array[0].length){
             return 0;
         }
         int sum=0;
        for (int i=0;i<array.length ;i++ ){
            sum += array[i][i];
        } 
        return sum;
    }
    
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
 
        int i = 0;
        System.out.println(Arrays.toString(nums));
        for (int j = 1; j < nums.length; j++) {
            System.out.println("i="+i+" j="+j);
            System.out.println("Compairing "+nums[j]+"!="+nums[i]);
            if (nums[j] != nums[i]) {
                i++;
                System.out.println("i="+i);
                nums[i] = nums[j];
            }
            System.out.println("Array after loops "+j+ " = "+Arrays.toString(nums));
        }
        System.out.println(Arrays.toString(nums));
        return i + 1;
    }
}
