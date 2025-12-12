# Scoring Guidelines

##  Your code should include these elements:
- create a `Scanner` that reads a text file
- create a `Scanner` that reads a line of text
- use a `while` loop to scan each line
- use `Scanner` methods `hasNextLine()`, `nextLine()`, `hasNext()`, and `next()`
- close `Scanner` at the end of each method
- print results and produce correct output
- use correct syntax for all above

## Canonical Solution
```
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
        System.out.println();
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
        System.out.println();
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
        System.out.println();
        input.close();
    }
}
```

## Correct Output
The program should print the following:

```
Line 1 has 26 words.     
Line 2 has 14 words.     
Line 3 has 10 words.     

Line 1's shortest word is: a      
Line 2's shortest word is: Oh     
Line 3's shortest word is: up     

Line 1's longest word is: Feathers
Line 2's longest word is: sticks  
Line 3's longest word is: throwing
```
