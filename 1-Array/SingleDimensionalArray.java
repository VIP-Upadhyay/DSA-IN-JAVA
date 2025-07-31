public class SingleDimensionalArray {
    public static void main(String[] args) {
        SingleDArray array = new SingleDArray(10);

        // Insert Element
        array.inset(0, 11);
        array.inset(1, 10);
        array.inset(4, 0);
        array.inset(1, 55);
        array.inset(11, 10);

        // Access the Element
        try {
            System.out.println(array.access(0));
            System.out.println(array.access(11));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }

        // Array traversal
        array.traverseArray();

        // Search Element in array
        array.search(10);
        array.search(33);

        // Delete Element in array
        array.delete(1);
        array.delete(11);
    }
}

class SingleDArray {
    private int arr[] = null;

    SingleDArray(int size){
        arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    // insert
   public void inset(int loc,int value){
        try {
            if(arr[loc]==Integer.MIN_VALUE){
            arr[loc]=value;
            System.out.println("Successfully inserted");
        }else{
            System.out.println("The Value Already Occupied");
        }
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Invalid Index");
        }
   }
   //access
   public int access(int loc) throws Exception{
        try {
            return arr[loc];
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            throw new Exception("Invalid Index");
        }
    }

    //traversal
    public void traverseArray(){
        try {
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]+" ");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Array no longer exists");
        }
    }

    public void search(int valueToSearch){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==valueToSearch){
                System.out.println("Value found at index of "+i);
                return;
            }
        }
        System.out.println(valueToSearch+" Value not found");
    }

    // Delete an array value
    public void delete(int loc){
        try {
            arr[loc] = Integer.MIN_VALUE;
            System.out.println("Deleted Successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Out of index");
        }
    }
}
