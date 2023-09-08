import java.io.*;
import java.util.Scanner;

public class RailFence {
    public static void main(String[] args) {

        String  cipher = "", enc_row1 = "", enc_row2 = "", dec_row1="", dec_row2="", dec_text = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the plain text: ");
        String plain_text = sc.nextLine();

        //        Ecryption

        for(int i=0; i<plain_text.length(); i+=2)
        {
            enc_row1 += plain_text.charAt(i);
        }
        System.out.println("Encrypted row1: "+enc_row1);

        for(int i=1; i<plain_text.length(); i+=2)
        {
                enc_row2 += plain_text.charAt(i);
        }

        System.out.println("Encrypted row2: "+enc_row2);
        cipher = enc_row1 + enc_row2;
        System.out.println("Encrypted text: "+cipher);

//Decryption

        if(cipher.length()%2!=0){
//Logic to determine the size of decrypted row1
            int dec_row1_size = ((cipher.length()+1)/2);
//Construction of decrypted row1 and row2 from cipher
            for(int i=0;i<cipher.length();i++){
                if(i<dec_row1_size){
                    dec_row1 += cipher.charAt(i);
                }
                else  {
                    dec_row2 += cipher.charAt(i);
                }
            }
        }
        if (cipher.length()%2==0){
            int dec_row1_size = cipher.length()/2;
            for (int i = 0; i<cipher.length();i++){
                if(i<dec_row1_size){
                    dec_row1+=cipher.charAt(i);
                }
                else {
                    dec_row2+=cipher.charAt(i);
                }
            }
        }
        System.out.println("Decrypted row1: "+dec_row1);
        System.out.println("Decrypted row2: "+dec_row2);
//Merging decrypted row1 and row2
        for (int i=0; i<dec_row1.length();i++){
            dec_text+=dec_row1.charAt(i);
            try {
                dec_text+=dec_row2.charAt(i);
            }
            catch (IndexOutOfBoundsException e){
                break;
            }
        }
        System.out.println("decrypted_text: "+dec_text);
    }
}
