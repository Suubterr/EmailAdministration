import java.util.Random;

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
            password += PASSWORD_CHARACTERS.charAt(rand.nextInt(PASSWORD_CHARACTERS.length()));
        }

        password = checkPassword(password);

        return password;
    }

    private static String checkPassword(String password) {

        /**TODO:
         * implement check for each category of symbols and if missing add one at random place and check again
        **/
        return password;
    }
}
