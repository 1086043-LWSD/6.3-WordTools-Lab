// CANONICAL SOLUTION

/* Given a paragraph from a data file (“text.txt”), create three static methods to find 
the word count, longest word, and shortest word in each line of the paragraph. */

import java.io.*;
import java.util.*;

public class WordToolsSolution {
    public static final String DATA_FILENAME = "text.txt";
    public static void main(String[] args) throws FileNotFoundException {
        wordCount(DATA_FILENAME);
        shortestWord(DATA_FILENAME);
        longestWord(DATA_FILENAME);
    }

    public static void wordCount(String filename) throws FileNotFoundException {
        File readFile = new File(filename);
        Scanner input = new Scanner(readFile);

        int n = 1;

        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineScan = new Scanner(line);

            int count = 0;
            while (lineScan.hasNext()) {
                lineScan.next();
                count++;
            }
            System.out.println("Line " + n + " has " + count + " words.");
            n++;

            lineScan.close();
        }
        input.close();
    }

    public static void shortestWord(String filename) throws FileNotFoundException {
        File readFile = new File(filename);
        Scanner input = new Scanner(readFile);

        int n = 1;

        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineScan = new Scanner(line);

            String word = lineScan.next();
            while (lineScan.hasNext()) {
                String next = lineScan.next();
                if (next.length() < word.length()) {
                    word = next;
                }
            }
            System.out.println("Line " + n + "'s shortest word is: " + word);
            n++;

            lineScan.close();
        }
        input.close();
    }

    public static void longestWord(String filename) throws FileNotFoundException {
        File readFile = new File(filename);
        Scanner input = new Scanner(readFile);

        int n = 1;

        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineScan = new Scanner(line);

            String word = lineScan.next();
            while (lineScan.hasNext()) {
                String next = lineScan.next();
                if (next.length() > word.length()) {
                    word = next;
                }
            }
            System.out.println("Line " + n + "'s longest word is: " + word);
            n++;

            lineScan.close();
        }
        input.close();
    }
}
