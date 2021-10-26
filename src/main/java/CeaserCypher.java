import java.util.Scanner;

public class App {
    static String lettersOfAlphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encoder (String userText, int shiftKey) {
        for (int i = 0; i<userText.length(); i++) {
            int userChar = lettersOfAlphabet.indexOf(userText.charAt(i));

        }
    }
}