package bnp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Hobbies
{

    private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();

    public void add(String hobbyist, String... hobbies)
    {
        this.hobbies.put(hobbyist, hobbies);
    }

    public List<String> findHobbyists(String hobby)
    {
        for (Entry<String, String[]> entry :hobbies.entrySet())
        {
        }
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args)
    {
        Hobbies hobbies = new Hobbies();
        hobbies.add("John", "Piano", "Puzzles", "Yoga");
        hobbies.add("Adam", "Drama", "Fashion", "Pets");
        hobbies.add("Mary", "Magic", "Pets", "Reading");

        System.out.println(Arrays.toString(hobbies.findHobbyists("Yoga").toArray()));

    }
}
