package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaKeywordsTest {




   @Test
    void checkWords_IsKeyword_true(){
       assertEquals(true, JavaKeywords.checkKeywords("keyword switch"));
       assertEquals(true, JavaKeywords.checkKeywords("Don't break my heart ;)"));
   }

   @Test
    void checkWords_NotKeyword_false(){
        assertEquals( false, JavaKeywords.checkKeywords("is not a keyword"));
      //  assertEquals(false, "I love breakdance Oo? ");
    }
}