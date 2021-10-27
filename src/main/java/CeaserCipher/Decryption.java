package CeaserCipher;

public class Decryption{
    public static String decryption(String userText, int shiftKey){
        String deciphered = "";
        String error = "";

        if(shiftKey < 1 || shiftKey > 25) {
            error = "Please input a key between 1 and 25";
        }
        else {
            int size = userText.length();

            for (int i = 0; i < size; i++){
                char oneChar = userText.charAt(i);
                if (Character.isLetter(oneChar)){
                    if(Character.isUpperCase(oneChar)){
                        char newChar = (char)(oneChar - shiftKey);
                        if (newChar<'A'){
                            deciphered += (char)(oneChar + (26-shiftKey));
                        }
                        else{
                            deciphered += newChar;
                        }
                    }
                    else if(Character.isLowerCase(oneChar)){
                        char newChar = (char)(oneChar-shiftKey);
                        if(newChar<'a'){
                            deciphered += (char)(oneChar +(26-shiftKey));
                        }
                        else {
                            deciphered += newChar;
                        }
                    }
                }
                else{
                    deciphered += oneChar;
                }
            }
            return deciphered;
        }
        return error;
    }
}