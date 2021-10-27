package CeaserCipher;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncryptionTest {

    @Test
    public void encryption(String userInput, int i) {
            Encryption testEncryption = new Encryption();
            String expectedOutput = "Please input a key between 1 and 25";
            assertEquals(expectedOutput, encryption_testuserInputLetter_String("svddvfrvs");
    }
    @Test
    public void encryption_testuserInputLetter_String(){
            Encryption testEncryption = new Encryption();
            String expectedOutput = "Brian";
            assertEquals(expectedOutput, encryption("sfsdcsd"));
    }

}