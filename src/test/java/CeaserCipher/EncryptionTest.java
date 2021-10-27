package CeaserCipher;


import CeaserCipher.Encryption;
import org.junit.Assert;
import org.junit.Test;

import static CeaserCipher.Encryption.encryption;
import static org.junit.Assert.assertEquals;

public class EncryptionTest{
    @Test
    public void encryption_testKeyRange_String() {
        Encryption testEncryption = new Encryption();
        String expectedOutput = "Please input a key between 1 and 25";
        assertEquals(expectedOutput, encryption("abc", 26));
    }
    @Test
    public void encryption_testuserInputLetter_String(){
        Encryption testEncryption = new Encryption();
        String expectedOutput = "dsfddvgrvs";
        assertEquals(expectedOutput, encryption("dsfddvgrvs", 3));
    }
}