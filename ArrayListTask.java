
import java.util.ArrayList;


public class ArrayListTask {
    public static void main(String [] args){
    
    int [] array = {1,3,4,5,6,6,7,8,9};
    ArrayList<Integer> mArrayList =new ArrayList<Integer>();

    for (int it : array) {
        mArrayList.add(it);
        
    }
    System.out.println(mArrayList);
    
   
        
    }
}
