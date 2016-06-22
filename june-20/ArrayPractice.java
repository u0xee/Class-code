public class ArrayPractice {
    public static void printPow3Mod(String[] arr) {
        for(int i = 1; i < 100; i = (i * 3) % arr.length) {
            System.out.println(arr[i]);
            if(arr[i].equals("I"))
                break;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"I", "remember", "when", "rock", "was", "young",
                "Me", "and", "Suzie", "had", "so", "much", "fun",
                "Holding", "hands", "and", "skimming", "stones",
                "Had", "an", "old", "gold", "Chevy", "and", "a", "place", "of", "my", "own",
                "But", "the", "biggest", "kick", "I", "ever", "got",
                "Was", "doing", "a", "thing", "called", "the", "Crocodile", "Rock",
                "While", "the", "other", "kids", "were", "Rocking", "Round", "the", "Clock",
                "We", "were", "hopping", "and", "bopping", "to", "the", "Crocodile", "Rock"};

        printPow3Mod(arr);
    }
}
