package asg;
import java.util.LinkedList;
import java.util.Queue;

public class Entry {
    Queue<String> quecue=new LinkedList<>();
    public void enter(String passportNumber) {
        quecue.add(passportNumber);
    }

    public String leave() {
        return quecue.poll();
    }
    
    public static void main(String[] args) {
        
        Entry entry = new Entry();
        entry.enter("AB54321");
        entry.enter("UK32032");
        System.out.println(entry.leave());
        System.out.println(entry.leave());
    }
}