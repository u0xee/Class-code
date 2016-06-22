public abstract class StringPair implements Comparable<StringPair> {
    public abstract String first();
    public abstract String second();

    public String toString() {
        return String.format("[%s, %s]", first(), second());
    }

    public boolean equals(Object o) {
        if(o instanceof StringPair) {
            StringPair sp = (StringPair) o;
            return first().equals(sp.first()) &&
                second().equals(sp.second());
        }
        return false;
    }

    public int compareTo(StringPair other) {
        int t = first().compareTo(other.first());
        if(t != 0)
            return t;
        return second().compareTo(other.second());
    }
}
