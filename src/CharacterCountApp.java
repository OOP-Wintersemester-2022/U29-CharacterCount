import java.util.HashMap;
import java.util.Scanner;

public class CharacterCountApp {

    private static final String EXIT_CMD = "exit";

    public static void main(String[] args) {
        evaluateConsoleOutput();
    }

    private static void evaluateConsoleOutput() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();

            if(s.equals(EXIT_CMD)) {
                break;
            }

            HashMap<Character, Integer> charOccurrences = getCharacterOccurrences(s);

            System.out.println(charOccurrences);
        }
    }

    private static HashMap<Character, Integer> getCharacterOccurrences(String s) {
        HashMap<Character, Integer> ret = new HashMap<>();

        for(char c: s.toCharArray()) {
            if(!ret.containsKey(c)) {
                ret.put(c, 0);
            }

            ret.put(c, ret.get(c) + 1);
        }

        return ret;
    }
}
