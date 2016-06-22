import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private class Counter {
        // declare a private long member variable
        // write a no argument constructor, starts at 0

        // write a method "current" to get the current value

        // write a method, "inc" to increment the value

        // write an equals and toString with @Override
    }

    private final Map<String, Counter> counts;

    public WordCounter() {
        counts = new HashMap<String, Counter>();
    }

    public void count(String s) {
        Counter c = counts.get(s);
        if(c != null)
            c.inc();
        else {
            counts.put(s, new Counter());
            count(s);
        }
    }

    public int countOf(String s) {
        Counter c = counts.get(s);
        if(c != null)
            return c.current();
        return 0;
    }

    // write an equals and toString with @Override
    // hint, don't work to hard, leverage HashMap's equals and toString

    public String highestCount() {
        // code here to return the highest count String
        return null;
    }
}
