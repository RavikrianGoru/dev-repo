import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S
{
    public static void main(String[] args)
    {
        // vmr-cus-0051
        // userlsv/EvaiKiO1234567890!
        
        List<String> l =new ArrayList<>(Arrays.asList("Ravi kiran","Gort ravi", "Chinna Kumar goru"));
        List al=l.stream()
                .map(x-> {return x.substring(x.lastIndexOf(" "), x.length());})
                .collect(Collectors.toList());
        System.out.println(al);
    }

}
