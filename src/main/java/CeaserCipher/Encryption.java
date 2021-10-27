package CeaserCipher;

public class Encryption{
    public static void encryption(String userInput, int shiftKey){
        String deciphered = "";
        String error = "";

        if(shiftKey < 1 || shiftKey > 25){
            error = "Please input a key between 1 and 25";
        }
        else{
            int size = userInput.length();

            for (int i = 0; i <size; i++){
                char oneChar = userInput.charAt(i);
                if(Character.isLetter(oneChar)){
                    if(Character.isUpperCase(oneChar)) {
                        char newChar = (char)(oneChar + shiftKey);
                        if (newChar>'Z'){
                            deciphered += (char)(oneChar -(26-shiftKey));
                        }
                        else{
                            deciphered += newChar;
                        }
                    }
                    else if (Character.isLowerCase(oneChar)){
                        char newChar = (char)(oneChar + shiftKey);
                        if(newChar>'z'){
                            deciphered += (char)(oneChar-(26-shiftKey));
                        }
                        else{
                            deciphered += newChar;
                        }
                    }
                }
                else {
                    deciphered += oneChar;
                }
            }
        }

    }
}