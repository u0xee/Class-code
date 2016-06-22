public class StringArrayPair extends StringPair {
    private final String[] pair;
    public StringArrayPair(String a, String b){
        pair = new String[2];
        pair[0] = a;
        pair[1] = b;
    }

    public String first() {
        return pair[0];
    }

    public String second() {
        return pair[1];
    }

    public static void main(String[] args) {
        StringPair sp = new StringArrayPair("hello", "world");
        System.out.println(sp);
    }
}
