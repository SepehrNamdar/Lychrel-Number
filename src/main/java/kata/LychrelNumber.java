package kata;

import java.math.BigInteger;
import java.util.Arrays;

public class LychrelNumber {

    private int limitIteration;

    public LychrelNumber(int limitIteration) {
        this.limitIteration = limitIteration;
    }

    public boolean isLychrel(BigInteger number) {
        if (limitIteration == 0) return true;
        if (isPalindrome(number)) return false;
        BigInteger sum = number.add(reverse(number));
        limitIteration--;
        return isLychrel(sum);
    }

    private boolean isPalindrome(BigInteger number) {
        BigInteger reversedNumber = reverse(number);
        return reversedNumber.equals(number);
    }

    private BigInteger reverse(BigInteger number) {
        String reversed = Arrays.stream(String.valueOf(number).split(""))
                .reduce((x, y) -> y + x)
                .orElseThrow();
        return new BigInteger(reversed);
    }
}
