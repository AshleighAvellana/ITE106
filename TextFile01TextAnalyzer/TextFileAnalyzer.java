import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileAnalyzer{

    public static void main(String[] args) {
        String filePath = "Klayd.txt"; 
        analyzeTextFile(filePath);
    }

    private static void analyzeTextFile(String filePath) {
        StringBuilder textBuilder = new StringBuilder();
        int wordCount = 0;
        int sentenceCount = 0;
        String longestWord = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                textBuilder.append(line).append(" ");
                
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;

                
                sentenceCount += line.split("[.!?]").length;
                
                
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        String upperText = textBuilder.toString().toUpperCase();

      
        System.out.println("Total number of words: " + wordCount);
        System.out.println("Total number of sentences: " + sentenceCount);
        System.out.println("Text in uppercase:\n" + upperText);
        System.out.println("The longest word: " + longestWord);
    }
}