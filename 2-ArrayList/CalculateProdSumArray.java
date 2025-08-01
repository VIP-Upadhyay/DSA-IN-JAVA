import java.util.ArrayList;

public class CalculateProdSumArray {
    public int[] sumProdArray(ArrayList<Integer> arrayList){// O(N)
        int sum=0;
        int prod=1;
        for (Integer integer : arrayList) {
            sum+=integer;
            prod*=integer;
        }
        return new int[]{sum,prod};
    }
}
