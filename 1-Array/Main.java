import java.util.Arrays;

class Main{
    public static void main(String[] arg){
        // Single Dimensional Array
        int[] intArray = new int[3];
        System.out.println("Without insterting value "+Arrays.toString(intArray));
        intArray[0]=1;
        intArray[1]=2;
        intArray[2]=3;System.out.println("With insterting value "+Arrays.toString(intArray));

        String sArray[] = {"a","b","c"};
        System.out.println(Arrays.toString(sArray));

        // Two Dimensional Array
        int[][] int2DArray;
        int2DArray = new int[2][2];
        
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;

        System.out.println(Arrays.deepToString(int2DArray));

        String s2DArray[][] = {{"a","b"},{"c","d"}};

        System.out.println(Arrays.deepToString(s2DArray));
    }
}