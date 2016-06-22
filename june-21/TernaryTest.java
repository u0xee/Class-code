public class TernaryTest {
    public string whatever(char c) {
        return c == '.' ?
            "That's a period" :
            c == '/' ?
            "That's a slash" :
            "That's something else";
    }

    public string whatever(char c) {
        if (c == '.')
            return "That's a period";
        else if (c == '/')
            return "It's a slash";
        else
            return "That's something else";
    }
}
