import java.util.TreeMap;

public class WordFrequencyTreeMap {

    /**
     * Counts word frequency in lowercase and stores in TreeMap (alphabetically sorted).
     */
    public static TreeMap<String, Integer> wordFrequencies(String text) {
        TreeMap<String, Integer> frequencyMap = new TreeMap<>();
        String[] words = text.toLowerCase().split("\\W+"); // split by non-word characters

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        String sampleText = "This is a sample text. This text is just a sample.";
        TreeMap<String, Integer> frequencies = wordFrequencies(sampleText);

        System.out.println("Word frequencies:");
        frequencies.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}
