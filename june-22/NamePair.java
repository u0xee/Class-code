public class NamePair extends StringPair {
    private PersonRecord p;

    public NamePair(PersonRecord p){
        this.p = p;
    }

    public String first() {
        return p.firstName;
    }

    public String second() {
        return p.lastName;
    }
}
