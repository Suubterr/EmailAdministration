import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class PasswordFactory {
    private static final String CAPITAL_CASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String SPECIAL_CHARACTERS = "!@#$";
    private static final String NUMBERS = "1234567890";
    private static final String PASSWORD_CHARACTERS =
            CAPITAL_CASE_LETTERS
            + LOWER_CASE_LETTERS
            + SPECIAL_CHARACTERS
            + NUMBERS
            ;

    public static String generatePassword(int length) {
        Random rand = new Random();
        String password = new String();

        while (password.length() < length) {
            password += PASSWORD_CHARACTERS.charAt(rand.nextInt(PASSWORD_CHARACTERS.length() - 1));
        }

        password = checkPassword(password);

        return password;
    }

    private static String checkPassword(String password) {

        boolean approved = false;

        System.out.println("Password: " + password);

        while (!approved) {
            for(char c : CAPITAL_CASE_LETTERS.toCharArray()) {
                approved = password.chars().mapToObj(w -> (char)w).collect(Collectors.toSet()).contains(c);
                System.out.println("Password contains %s character: %b".formatted(c, approved));

                if(approved) break;
            }

        }
        return password;
    }
}
