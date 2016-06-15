public class EvenSeq {
    private IntSeq input;

    public EvenSeq(IntSeq input) {
        this.input = input;
    }

    public int next() throws NoSuchElementException {
        int candidate = input.next();
        if(candidate % 2 == 0)
            return candidate;
        else {
            return next();
        }

    }
}
