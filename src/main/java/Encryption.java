package CeaserCipher;

public class Encryption{
    public static String encryption(String userInput, int shiftKey){
        String secondResult;
        String error;

        if(shiftKey < 1 || shiftKey > 25){
            error = "Please input a key between 1 and 25";
        }
        else{
            int size = userInput.length();

            for (int i = 0; i <length; i++){
                char oneChar = userInput.charAt(i);
                if(Character.isLetter(oneChar)){
                    if(Character.isUpperCase(oneChar)) {
                        char newChar = (char)(oneChar + shiftKey);
                        if (newChar>'Z'){
                            secondResult += (char)(oneChar -(26-shiftKey));
                        }
                        else{
                            secondResult += newChar;
                        }
                    }
                    else if (Character.isLowerCase(oneChar)){
                        char newChar = (char)(oneChar + shiftKey);
                        if(newChar>'z'){
                            secondResult += (char)(oneChar-(26-shiftKey));
                        }
                        else{
                            secondResult += newChar;
                        }
                    }
                }
                else {
                    secondResult += oneChar;
                }
            }
        }

    }
    return error;
}