import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ArrayListEx {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(new File("info.txt"));

        while(sc.hasNextInt()) {
            arr.add(sc.nextInt());
        }


        System.out.println("arr is: " + arr);
    }
}
