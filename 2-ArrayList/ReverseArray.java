public class ReverseArray {
    public int[] reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int rightIndex = arr.length - i -1;
            int temp = arr[i];
            arr[i] = arr[rightIndex];
            arr[rightIndex] = temp;
        }
        return arr;
    }
}
