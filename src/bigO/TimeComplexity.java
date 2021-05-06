package bigO;

public class TimeComplexity {
    //TODO: O(1) Constant Time
    // The fastest
    public static void printFirstNumber(int[] numbers) {
        System.out.println(numbers[0]);
    }

    //TODO: O(log N) Logarithmic Time
    // The second fastest
    //Binary search algorithm is a common example of O(log N)
    //Note: Takes in an ALREADY SORTED array
    //The algorithm compares the key value with the middle element of the array; if they are unequal, the half in which the key cannot be part of is eliminated, and the search continues for the remaining half until it succeeds.
    public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //The runBinarySearchIteratively method takes a sortedArray, key & the low & high indexes of the sortedArray as arguments.
    // When the method runs for the first time the low, the first index of the sortedArray, is 0, while the high, the last index of the sortedArray, is equal to its length – 1.
    //The middle is the middle index of the sortedArray. Now the algorithm runs a while loop comparing the key with the array value of the middle index of the sortedArray.

    public int runBinarySearchRecursively(int[] sortedArray, int key, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            return -1;
        }

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return runBinarySearchRecursively(sortedArray, key, low, middle - 1);
        } else {
            return runBinarySearchRecursively(sortedArray, key, middle + 1, high);
        }
    }


    //TODO: O(N) Linear Time
    public static void printAllNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }


    //TODO: O(N^2) Quadratic time
    //Nesting two loops. If the array has N number, the outer loop runs N times and the inner loop runs N times for each iteration of the outer loop, giving N^2 total prints.
    // If the array has 10 items, we have to print 100 times. If it has 1,000 items, we have to print 1,000,000 times.
    public static void printAllPossibleOrderedPairs(int[] numbers) {
        for (int firstItem : numbers) {
            for (int secondItem : numbers) {
                System.out.println(firstItem + ", " + secondItem);
            }
        }
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        printFirstNumber(numbers);
        printAllNumbers(numbers);
        printAllPossibleOrderedPairs(numbers);
    }
}
