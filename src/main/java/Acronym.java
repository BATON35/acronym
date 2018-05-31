import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
      String[] words = phrase.toUpperCase().split("[\\s-_]");
      StringBuilder stringBuilder = new StringBuilder();
      for(String word: words){
          stringBuilder.append(word.charAt(0));
      }
        return stringBuilder.toString();
    }
}
