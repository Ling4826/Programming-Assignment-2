
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.nio.file.Path;

public class Checkwords {
    int character = 0, Palindrome = 0, Numberoftokens = 0, Numberofemoticon = 0, line = 0, average = 0;
    String longest = "";

    public void setLine(int line) {
        this.line = line;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        // input file name
        System.out.print("Please enter the file path.: ");
        String inputPath = scanner.nextLine();
        // starting counter time
        long startTime = System.nanoTime();

        Checkwords c = new Checkwords();
        // make filePathS
        Path filePath = Paths.get("D:\\InputFile\\" + inputPath);
        // read alllines of file
        List<String> all = Files.readAllLines(filePath);
        // set line number
        c.setLine(all.size());

        for (int i = 0; i < all.size(); i++) {
            // split each line by space and count word, character, palindrome, and emoticon.
            StringTokenizer st = new StringTokenizer(all.get(i), " ");
            // count word, character, palindrome, and emoticon in each line.
            while (st.hasMoreTokens()) {
                c.count(st.nextToken());
            }
        }
        // calculate average word length
        c.averageword();
        // print result
        c.print();

        scanner.close();
        // stop time
        long endTime = System.nanoTime();
        System.out.printf("Total time to execute this program: %.2f secs%n", (endTime - startTime) / 1_000_000_000.0);
        System.out.println();
        System.out.println("Program terminated properly!");
    }

    public void count(String word) {
        Numberoftokens++;
        countCharacter(word);
        countPalindrome(word);
        countemoticon(word);
        longestword(word);
    }

    // count Character
    public void countCharacter(String word) {
        character = character + word.length();
    }

    // count palindromes
    public void countPalindrome(String word) {
        String reverse = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(reverse))
            Palindrome++;
    }

    // count emoticon
    public void countemoticon(String word) {
        if (word.equals(":D")) {
            Numberofemoticon++;
        }
        if (word.equals(":)")) {
            Numberofemoticon++;
        }
    }

    // fine longestword
    public void longestword(String word) {
        if (word.length() > longest.length()) {
            longest = word;
        }
    }

    // make averageword
    public void averageword() {
        average = character / Numberoftokens;
    }

    // display
    public void print() {
        System.out.println("Program start:");
        System.out.println();
        System.out.println("Total # Character count: " + character);
        System.out.println("Total # Palindrome found: " + Palindrome);
        System.out.println("Total Number of tokens: " + Numberoftokens);
        System.out.println("Total Number of emoticon: " + Numberofemoticon);
        System.out.println("Total # of new line: " + line);
        System.out.println("The longest token: " + longest);
        System.out.println("The average token size: " + average);

    }

}
