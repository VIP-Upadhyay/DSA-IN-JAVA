import java.util.ArrayList;

public class PrintPairs {

    public ArrayList<String> getPairs(int[] array){ // O(N^2)
        ArrayList<String> pairs = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                pairs.add("("+array[i]+", "+array[j]+")");
            }
        }
        return pairs;
    }
    
} 