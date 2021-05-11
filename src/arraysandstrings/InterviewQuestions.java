package arraysandstrings;

public class InterviewQuestions {
    //TODO: is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
    public static boolean hasUniqueChars(String str) {
        if(str == null || str.isEmpty()) {
            return false;
        }
        // Assuming string can have characters a-z (NO UPPERCASE)
        // this has 32 bits set to 0
        int checker = 0;

        for (int i = 0; i < str.length(); i++) {
            int bitAtIndex = str.charAt(i) - 'a';

            // if that bit is already set in checker, return false
            if ((checker & (1 << bitAtIndex)) > 0)
                return false;

            // otherwise update and continue by setting that bit in the checker
            checker = checker | (1 << bitAtIndex);
        }

        // no duplicates encountered, return true
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasUniqueChars("hello")); //false
        System.out.println(hasUniqueChars("eliza")); //true
        System.out.println(hasUniqueChars("hey")); //true
        System.out.println(hasUniqueChars(null)); //false
        System.out.println(hasUniqueChars("")); // false
    }
}
