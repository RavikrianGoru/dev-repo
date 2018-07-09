package jenkov.collections;

import java.util.EnumSet;
import java.util.Set;

enum Days
{
    monday, tuesday, wednesday, thursday, friday, saturday, sunday;
    
    public static Set<Days> allDays = EnumSet.allOf(Days.class);
    public static Set<Days> weekdays = EnumSet.range(monday, friday);

    public boolean isWeekDay()
    {
        return weekdays.contains(this);
    }
}
public class EnumSetDemo
{
    public static void main(String[] args)
    {
        System.out.println(Days.allDays);
        System.out.println(Days.weekdays);
        System.out.println(Days.monday.isWeekDay());
        
    }

}
