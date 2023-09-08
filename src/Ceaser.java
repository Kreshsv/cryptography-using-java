import java.io.*;

public class Ceaser {
    public static void main(String[] args) {

//        TRYING OUT CEASER CIPHER FOR A SINGLE CHARACTER

//            String character = "x";
//            System.out.println("Char to be encrypted: " +character);
//
//            int shift = 6, ascii_of_char = (int)character.charAt(0);
//
//            if (Character.isUpperCase(character.charAt(0))){
//
//                ascii_of_char = (ascii_of_char -65 + shift) % 26 + 65;
//
//            }
//            else {
//                ascii_of_char = (ascii_of_char -97 + shift) % 26 + 65;
//            }
//
//            character = "";
//            character += (char)ascii_of_char;
//
//            System.out.println("encrypted character: " +character);


            String character = "kreshanth", cipher_txt = "", original_txt = "";
            int shift = 6, ascii_of_char;
            System.out.println("Char to be encrypted: " +character);

//            ENCRYPTION

            for (int i=0; i<character.length(); i++){
                ascii_of_char = (int)character.charAt(i);
                if (Character.isUpperCase(character.charAt(i))){

                    ascii_of_char = (ascii_of_char -65 + shift) % 26 + 65;

                }
                if (Character.isLowerCase(character.charAt(i)))
                {
                    ascii_of_char = (ascii_of_char -97 + shift) % 26 + 65;
                }

                cipher_txt += (char)ascii_of_char;

            }

            System.out.println("encrypted text: " +cipher_txt);

//            DECRYPTION

        for (int i=0; i<cipher_txt.length(); i++){
            ascii_of_char = (int)cipher_txt.charAt(i);
            if (Character.isUpperCase(cipher_txt.charAt(i))){

                ascii_of_char = (ascii_of_char -65 - shift) % 26 + 65;

            }
            if (Character.isLowerCase(cipher_txt.charAt(i)))
            {
                ascii_of_char = (ascii_of_char -97 - shift) % 26 + 65;
            }

            original_txt += (char)ascii_of_char;

        }

        System.out.println("encrypted text: " +original_txt);




        }
    }

// done baby !