import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Main{
    public static void main(String[] args) {
        // Initialize 
        ArrayList<Integer> numbers = new ArrayList<>();

        // Insertion
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2,4);
        System.out.println(numbers);
        ArrayList<String> aStrings = new ArrayList<>();
        aStrings.add("Hello");
        aStrings.add("World");
        aStrings.add(1,"Working");
        System.out.println(aStrings);
        // Accessing 
        System.out.println(numbers.get(0));
        System.out.println(aStrings.get(1));

        // Traversal 

        //For Loop
         System.out.println("\nFor Loop ");
        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
        // For Each loop
         System.out.println("\nFor Each Loop ");
        for (Integer num : numbers) {
            System.out.println(num);
        }
        // Iterator
        System.out.println("\nIterator");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Searching 
        int value = 1;
        for(Integer num : numbers){
            if(num==value){
                System.out.println("value found");
                break;
            }
        }
        // indexOf
        int index = numbers.indexOf(value);
        System.out.println("Value found at index of "+index);

        //Delete
        System.out.println(aStrings);
        System.out.println(numbers);
        numbers.remove(2);// by index
        aStrings.remove("Hello");// by object
        System.out.println(aStrings);
        System.out.println(numbers);

        System.out.println("Printing the sum of the arraylist");
        CalculateProdSumArray calculateProdSumArray = new CalculateProdSumArray();
        int[] sumProd = calculateProdSumArray.sumProdArray(numbers);
        System.out.println("The sum and product of "+numbers+" is "+Arrays.toString(sumProd));

        System.out.println("Printing the pairs of array");
        PrintPairs printPairs = new PrintPairs();
        int arr[] = {1,2,3,4,5};
        System.out.println("The pairs of "+Arrays.toString(arr)+" is");
        System.out.println(printPairs.getPairs(arr));

        System.out.println("Printing the reverse of array");
        ReverseArray reverseArray = new ReverseArray();
        // int arr[] = {1,2,3,4,5};
        System.out.println("The pairs of "+Arrays.toString(arr)+" is");
        System.out.println(Arrays.toString(reverseArray.reverse(arr)));
    }


}