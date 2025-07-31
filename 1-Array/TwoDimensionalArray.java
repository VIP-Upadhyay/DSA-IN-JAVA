import java.util.Arrays;

class TwoDimensionalArray{
    public static void main(String[] args) {
        DoubleArray array = new DoubleArray(5, 5);
        array.insert(0, 0, 5);
        array.insert(0, 1, 1);
        array.insert(1, 0, 0);
        array.insert(1, 1, 12);

        System.out.println(Arrays.deepToString(array.getArray()));

        array.access(0, 0);
        array.access(0, 1);
        array.access(1, 0);

        array.traversal2DArray();

        array.search(0);
        array.search(10);

        array.delete(0, 0);
        array.delete(0, 1);
    }
}

class DoubleArray {
    private int[][] arr;
    DoubleArray(int row, int col){
        arr = new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }


    // get 2d array
    public int[][] getArray(){
        return this.arr;
    }

    // inset 2d array
    public void insert(int row,int col, int value){
        try {
            if(arr[row][col]==Integer.MIN_VALUE){
                arr[row][col]=value;
            }else{
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Invalid 2d Array index");
        }
    }

    // access 2d array
    public void access(int row, int col){
        try {
            System.out.println("The cell value is "+arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Invalid 2d Array index");
        }
    }

    // traverse 2d array
    public void traversal2DArray(){
        try {
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("2d Array no longer exists");
        }
    }

    // searching element in 2d array
    public void search(int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==value) {
                    System.out.println("Value "+value+" found at index arr["+i+"]"+"["+j+"]");
                    return;
                }
            }
        }
        System.out.println(value+" Value not found");
    }
    // deleting 2d array element
    public void delete(int row, int col){
        try {
            arr[row][col]=Integer.MIN_VALUE;
            System.out.println("Deleted Successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("invalid array index");
        }
    }
}