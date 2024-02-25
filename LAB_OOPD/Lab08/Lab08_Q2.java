import java.util.*;

public class Lab08_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> characterCount = new HashMap<>();
        String input = sc.nextLine();
        input = input.toLowerCase(); // Convert input to lowercase

        

        for(char c: input.toCharArray()){
            characterCount.put(c, characterCount.getOrDefault(c, 0)+1);
        }
        printOccurences(characterCount);
        TreeMap<Character, Integer> sortedCharacterCount = new TreeMap<>(characterCount);

        printOccurences(sortedCharacterCount);


        while (true) {
            System.out.print("Enter a character to search: ");
            char searchChar = sc.next().toLowerCase().charAt(0); // Convert input character to lowercase

            if (characterCount.containsKey(searchChar)) {
                int occurrences = characterCount.get(searchChar);
                System.out.printf("The sentence contains %d '%c'.\n", occurrences, searchChar);
            } else {
                System.out.printf("The sentence does not contain character '%c'.\n", searchChar);
            }
        }

    }
    public static void printOccurences(Map<Character,Integer> count){

            System.out.print("{ ");
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + ", ");
        }
        System.out.println("}");
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.printf("%-5s %d\n", entry.getKey(), entry.getValue());
        }
        }
    }

