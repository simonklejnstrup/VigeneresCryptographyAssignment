package demo;

public class Cipher {

    public String generateKey(String str, String key)
    {
        //Fjerne whitespaces og specielle tegn fra originaltekst
        String strOnlyCharacters = eraseWhiteSpaceAndSpecialCharacters(str);

        int x = strOnlyCharacters.length();

        for (int i = 0; ; i++)
        {
            if (x == i)
                i = 0;
            if (key.length() == strOnlyCharacters.length())
                break;
            key+=(key.charAt(i));
        }
        return key;
    }

    public String cipherText(String str, String key)
    {
        String cipher_text="";

        for (int i = 0; i < str.length(); i++)
        {
            // converting in range 0-25
            int x = (str.charAt(i) + key.charAt(i)) %26;

            // convert into alphabets(ASCII)
            x += 'A';

            cipher_text+=(char)(x);
        }
        return cipher_text;
    }



    public String eraseWhiteSpaceAndSpecialCharacters(String str){
        return str.replaceAll("[^a-zA-Z]","");
    }
}
