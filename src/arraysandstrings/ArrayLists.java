package arraysandstrings;

import java.util.ArrayList;

public class ArrayLists {
    //TODO: Merge two arrays with words in them
    public static ArrayList<String> merge(String[] words, String[] moreWords) {
        ArrayList<String> sentence = new ArrayList<String>();

        if(words == null || words.length == 0) {
            addWordsToSentence(moreWords, sentence);
            return sentence;
        }

        if(moreWords == null || moreWords.length == 0) {
            addWordsToSentence(words, sentence);
            return sentence;
        }

        addWordsToSentence(words, sentence);
        addWordsToSentence(moreWords, sentence);

        return sentence;
        //return ArrayList of Strings that contains the words from both arrays
    }

    public static void addWordsToSentence(String[] words, ArrayList<String> sentence) {
//        sentence.addAll(Arrays.asList(words));
        for(String word : words) {
            sentence.add(word);
        }
    }

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] empty = null;
        String[] lengthZero = {};
        String[] newWords = {"new", "this", "one"};

        System.out.println(merge(cars, newWords));
        System.out.println(merge(empty, newWords));
        System.out.println(merge(cars, empty));
        System.out.println(merge(lengthZero, newWords));
        System.out.println(merge(cars, lengthZero));
    }
}
