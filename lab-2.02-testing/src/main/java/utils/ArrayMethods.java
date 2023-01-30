package utils;
import java.util.ArrayList;
import java.util.List;


public class ArrayMethods {

    public static List<Integer> getOddList(int n) {

    List<Integer> result = new ArrayList<>();
        for(int i=1; i<= n; i++){
            if(i%2 != 0){
        result.add(i);
        }
    }
        return result;
    }

}
