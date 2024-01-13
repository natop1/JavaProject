package project2;

public class task2 {

    public static void main(String[] args) {
        String word = "New York is a big city";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                count++;

            }
        }
        System.out.println("There are " + count + " alpha characters");
    }
}