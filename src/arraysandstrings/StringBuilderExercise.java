package arraysandstrings;

public class StringBuilderExercise {
    public static StringBuilder joinWords(String[] words) {
        StringBuilder sentence = new StringBuilder();
        for(String word : words) {
            sentence.append(word);
        }
        return sentence;
    }
    public static void main(String[] args) {
        String[] words = {"one", "two", "three", "four", "five"};
        System.out.println(joinWords(words)); //onetwothreefourfive
    }
}
