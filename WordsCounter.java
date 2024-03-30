import java.util.ArrayList;
import java.util.HashMap;

public class WordsCounter {
    private ArrayList<String> fructs;
    private HashMap<String, Integer> wordToCnt;

    public WordsCounter(ArrayList<String> fructs) {
        this.fructs = new ArrayList<>(fructs);
    }

    public Integer getCntOfWords() {
        return fructs.size();
    }

    private void frequencyOfWord() {
        wordToCnt = new HashMap<String, Integer>();
        for (String fruct : fructs) {
            if (fruct.length() > 1) {
                wordToCnt.putIfAbsent(fruct, 0);
                wordToCnt.put(fruct, wordToCnt.get(fruct) + 1);
            }
        }
    }

    public String getLongerWord() {
        String longer = fructs.get(0);
        for (String fruct : fructs) {
            if (fruct.length() > longer.length()) {
                longer = fruct;
            }
        }
        return longer;
    }

    public void printWords() {
        frequencyOfWord();
        wordToCnt.forEach((key, value) -> System.err.println(key + ": " + value));
    }
}