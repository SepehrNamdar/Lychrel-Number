package kata;

import java.math.BigInteger;

import static java.util.Arrays.stream;

public class LychrelNumber {

    private final int limitIteration;

    public LychrelNumber(int limitIteration) {
        this.limitIteration = limitIteration;
    }

    public boolean isLychrel(BigInteger number) {
        int i = numberOfIteration(number);
        return i == limitIteration;
    }

    private int numberOfIteration(BigInteger number) {
        for (int i = 0; i < limitIteration; i++) {
            if (isPalindrome(number)) {
                System.out.println(i);
                return i;
            }
            BigInteger reversedNumber = reverse(number);
            number = number.add(reversedNumber);
            System.out.println(number);
        }
        return limitIteration;
    }

    private boolean isPalindrome(BigInteger number) {
        BigInteger reversedNumber = reverse(number);
        return reversedNumber.equals(number);
    }

    private BigInteger reverse(BigInteger number) {
        String reversed = stream(String.valueOf(number).split(""))
                .reduce((x, y) -> y + x)
                .orElseThrow();
        return new BigInteger(reversed);
    }
}
