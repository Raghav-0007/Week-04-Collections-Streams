package countwords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
        public static void main(String[] args) {
            String filePath = "src/main/resources/textfile.txt";  // Change to your file path

            try {
                Map<String, Integer> wordCountMap = countWords(filePath);
                displayTopWords(wordCountMap, 5);
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        }

        // Method to count word occurrences
        public static Map<String, Integer> countWords(String filePath) throws IOException {
            Map<String, Integer> wordCountMap = new HashMap<>();
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z]", " ").split("\\s+"); // Remove punctuation & split words
                for (String word : words) {
                    if (!word.isEmpty()) {  // Ignore empty strings
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
            reader.close();
            return wordCountMap;
        }

        // Method to display the top N most frequent words
        public static void displayTopWords(Map<String, Integer> wordCountMap, int topN) {
            List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCountMap.entrySet());
            sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));  // Sort by frequency (descending)

            System.out.println("Total words: " + wordCountMap.size());
            System.out.println("\nTop " + topN + " most frequently occurring words:");

            for (int i = 0; i < Math.min(topN, sortedList.size()); i++) {
                System.out.println(sortedList.get(i).getKey() + " - " + sortedList.get(i).getValue());
            }
        }
    }
