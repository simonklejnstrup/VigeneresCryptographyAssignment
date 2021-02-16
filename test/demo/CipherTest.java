package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {



    @Test
    void eraseWhiteSpaceAndSpecialCharactersTest() {
         Cipher cipher = new Cipher();

        String str = "Hej, min ven!";

        String result = cipher.eraseWhiteSpaceAndSpecialCharacters(str);

        assertEquals("Hejminven", result);
    }

    @Test
    void generateKey() {
        Cipher cipher = new Cipher();

        String str = "Hej, vil du med ud og bowle i dag, eller hvad?";

        //Hejvildumedudogbowleidagellerhvad
        //hundhundhundhundhundhundhundhundh

        //String keyword = "hund";

        String keyword = "kat";



        assertEquals("hundhundhundhundhundhundhundhundh", cipher.generateKey(str, keyword) );




    }
}