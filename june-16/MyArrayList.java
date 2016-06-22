public class MyArrayList {
    int[] data;
    int fill;
    public MyArrayList() {
        data = new int[0];
        fill = 0;
    }


    public int get(int index) {
        if(0 <= index && index < data.length)
            return data[index];
        throw new IndexOutOfBoundsException(index);
    }

    public void add(int toAdd) {
        try {
            this.get(fill);
        } catch (IndexOutOfBoundsException e) {
            this.resize();
        }
        data[fill++] = toAdd;
    }


    public static void main(String[] args) {
        MyArrayList a = new MyArrayList();

        a.add(1);

        System.out.println(a.get(0));
    }
}
