package CeaserCipher;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptionTest {

    @Test
    public void encryption_testUserInputLetter_String() {
        Encryption testEncryption = new Encryption();
        String expectedOutput = "Brian";
        assertEquals(expectedOutput, testEncryption.encryption("Csjbo", 1));
    }

    @Test
    public void encryption_testUserTextOtherCharacters_String(){
        Encryption testEncryption = new Encryption();
        String expectedOutput = "Makau";
        assertEquals(expectedOutput, testEncryption.encryption("Nblbv", 1));
    }
    @Test
    public void encrypt_testUserTextUppercase_String(){
        Encryption testEncryption = new Encryption();
        String expectedOutput = "GHL";
        assertEquals(expectedOutput, testEncryption.encryption("HIM", 1));
    }
}