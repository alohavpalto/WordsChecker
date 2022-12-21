import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

  protected String text;
  protected Set<String> words = new HashSet<>();

  public WordsChecker(String text) {
    this.text = text;
    String[] other = text.split("\\P{IsAlphabetic}+");
    for (String word : other) {
      words.add(word);
    }
  }

  public boolean hasWord(String word) {
    return words.contains(word);
  }
}