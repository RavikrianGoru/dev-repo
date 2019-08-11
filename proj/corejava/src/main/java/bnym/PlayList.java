package bnym;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayList
{

    public static void main(String[] args)
    {
        // can have duplicate
        List<String> playList = new ArrayList<>(Arrays.asList("DayDay", "ByeBye", "Morning", "Welcome", "ByeBye", "DayDay", "Chinnu", "Welcome"));
        int currentSongIndex = 2;
        String nextSong = "Chinnu";

        System.out.println(playList);
        System.out.println("Play song index:" + currentSongIndex);
        System.out.println("Next Song:" + nextSong);
        System.out.println("List size:" + playList.size());

        int min = minStepsUpOrDown(playList, currentSongIndex, nextSong);
        System.out.println(min);
    }

    public static int minStepsUpOrDown(List<String> playList, int currentSongIndex, String nextSong)
    {
        int up = currentSongIndex;
        int down = currentSongIndex;
        int size = playList.size();
        int minSteps = 0;
        while (minSteps <= size)
        {
            minSteps++;
            down--;
            // System.out.println("Down :"+down);
            if (down < 0)
            {
                down = size + down;
            }
            up++;
            // System.out.println("Up :"+up);
            if (up > size)
            {
                up = up % size;
            }
            if (playList.get(down).equals(nextSong) || playList.get(up).equals(nextSong))
            {
                return minSteps;
            }
        }
        return -1;
    }

}
