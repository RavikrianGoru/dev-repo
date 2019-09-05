package nielsen;

import java.util.regex.Pattern;

public class EmailValidate
{

    public static boolean validateMail(String mailId)
    {
        return Pattern.matches("[^_\\-.][a-zA-Z0-9.\\-_]+@[a-z]+.(com|org|net)", mailId);
    }

    public static void main(String[] args)
    {
        System.out.println(validateMail(".ravikiran.goru@gmail.com"));
        System.out.println(validateMail("-ravikiran-goru@gmail.com"));
        System.out.println(validateMail("_ravikiran.goru@gmail.com"));
        System.out.println(validateMail("ravikiran.goru@gmail.com"));
        System.out.println(validateMail("ravikiran.goru@gmail.com"));
        System.out.println(validateMail("ravikiran.goru@gmail.com"));
        
    }

}
