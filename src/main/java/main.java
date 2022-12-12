import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        String p = PasswordFactory.generatePassword(8);

//        String a = "abc";
//        String b = "cde";

//        for (char c : a.toCharArray()) {
//            System.out.println(b.toCharArray());
//            Set<Character> mySet = b.chars().mapToObj(w -> (char)w).collect(Collectors.toSet());
//            System.out.println("mySet: " + mySet);
//
//            boolean q = mySet.contains(c);
//            System.out.println("String b contains %s: %b".formatted(c, q));
//        }
    }
}
