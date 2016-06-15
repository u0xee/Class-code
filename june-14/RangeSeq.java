import java.util.NoSuchElementException;

public class RangeSeq implements IntSeq {
    private int curr;
    private final int end;
    private final int step;


    public RangeSeq() {
        this(0);
    }

    public RangeSeq(int start) {
        this(start, start - 1);
    }

    public RangeSeq(int start, int end) {
        this(start, end, 1);
    }

    public RangeSeq(int start, int end, int step) {
        this.curr = start;
        this.end = end;
        this.step = step;
    }

    public int next() throws NoSuchElementException {
        if(curr >= end)
            throw new NoSuchElementException("Hit end of range!");
        int t = curr;
        curr += step;
        return t;
    }

    public static void main(String[] args) {
        IntSeq seq = new RangeSeq(0, 12, 3);

        while(true) {
            System.out.println(seq.next());
        }
    }
}
