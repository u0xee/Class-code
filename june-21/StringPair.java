public abstract class StringPair {



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
}
