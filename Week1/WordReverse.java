package Week1;

import java.util.Scanner;

public class WordReverse {

    public static void main(String[] args) {

        String word;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word:");
        word = input.nextLine();

        char[] letters = new char[word.length()];
        // char[] letters = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            letters[i] = word.charAt(i);
            System.out.print(letters[i]);
        }
        System.out.println();
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        input.close();
    }

}
