package kata;

import static java.lang.Integer.parseInt;
import static java.util.Arrays.stream;

public class LychrelNumber {

    public boolean isLychrel(int number) {
        int reversed = reverse(number);
        return !isPalindrome(reversed + number);
    }

    private boolean isPalindrome(int number) {
        int reversedNumber = reverse(number);
        return reversedNumber == number;
    }

    private int reverse(int entry) {
        String reversed = stream(String.valueOf(entry).split(""))
                .reduce((x, y) -> y + x)
                .orElseThrow();
        return parseInt(reversed);
    }

}
