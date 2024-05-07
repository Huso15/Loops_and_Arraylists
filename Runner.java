import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Tiree");
        scottishIslands.add("Jura");
        scottishIslands.add("Islay");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
        scottishIslands.add("Coll");

        System.out.println("Index position of Skye: " + scottishIslands.indexOf("Skye"));

        scottishIslands.remove("Tresco");

        System.out.println("Number of islands:" + scottishIslands.size());

        Collections.sort(scottishIslands);

        System.out.println("List of islands:");
        for (String island : scottishIslands) {
            System.out.println(island);
        }

//        1. Add "Coll" to the end of the list ^^
//        2. Add "Tiree" to the start of the list ^^
//        3. Add "Islay" after "Jura" and before "Mull" ^^
//        4. Print out the index position of "Skye" ^^
//        5. Remove "Tresco" from the list by name ^^
//        6. Remove "Arran" from the list by index ^^
//        7. Print the number of islands in your arraylist ^^
//        8. Sort the list alphabetically ^^
//        9. Print out all the islands using a for loop ^^

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

        System.out.println("Even numbers:");
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        // Finding the maximum value in the list
        int max = Collections.max(numbers);

        // Finding the minimum value in the list
        int min = Collections.min(numbers);

        // Calculating the difference
        int difference = max - min;

        // Printing the difference
        System.out.println("Difference between the largest and smallest value: " + difference);

        boolean containsAdjacentOnes = false;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) == 1 && numbers.get(i + 1) == 1) {
                containsAdjacentOnes = true;
                break;
            }
        }

        System.out.println("Contains adjacent 1s: " + containsAdjacentOnes);

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println("Sum of the numbers: " + sum);

//        1. Print out a list of the even integers ^^
//        2. Print the difference between the largest and smallest value ^^
//        3. Print True if the list contains a 1 next to a 1 somewhere. ^^
//        4. Print the sum of the numbers, ^^

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

    }

}
