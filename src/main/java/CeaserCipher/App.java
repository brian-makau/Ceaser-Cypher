package CeaserCipher;

import java.util.Scanner;

import static CeaserCipher.Decryption.decryption;
import static CeaserCipher.Encryption.encryption;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Text you would like to encode");
        String userInput;
        userInput = scanner.nextLine();

        System.out.println("Choose a key between 1 and 25");
        int shiftKey = scanner.nextInt();

        String result = (encryption(userInput, shiftKey));
        System.out.println("Here is your result >> " + result);

        String deciphered = (decryption(result, shiftKey));
        System.out.println("This is your decrypted text >> " + deciphered);
    }
}