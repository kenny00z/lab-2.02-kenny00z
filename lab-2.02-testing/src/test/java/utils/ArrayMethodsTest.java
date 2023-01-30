package utils;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {


   // ArrayMethods arrayMethods = new ArrayMethods();


    List<Integer> result;
    @BeforeEach
    void setUp(){
        result = new ArrayList<>();
        result.add(1);
        result.add(3);
        result.add(5);
        result.add(7);
        result.add(9);
        result.add(11);
        result.add(13);
        result.add(15);
        result.add(17);
    }

@Test
    void createNewOddArrayList_PositiveInt_Works(){
//    List<Integer> result = new ArrayList<>();
//    result.add(1);
//    result.add(3);
//    result.add(5);

    //assertEquals(result, arrayMethods.getOddList(6));
    assertEquals(result, ArrayMethods.getOddList(17));
}


}