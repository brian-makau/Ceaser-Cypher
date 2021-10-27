package CeaserCipher;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptionTest {

    @Test
    public void decryption() {
        Decryption testDecryption = new Decryption();
        String expectedOutput = "My name is Brian";
        assertEquals(expectedOutput, testDecryption.decryption("My name is Brian", 5));
    }
}