
public class RK_Test
{
    public static void main(String[] args)
    {
        String input ="RavikirnGoruGuntur";
        Object obj=null;
        int len= input.length();
        for(int i =3; i<len;i+=3)
        {
            System.out.println(input.substring(i-3, i));
        }
    }
}
