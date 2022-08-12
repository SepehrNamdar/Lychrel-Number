package kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

public class LychrelNumberTest {

    private static final int LIMIT_ITERATION = 1000;

    private LychrelNumber lychrelNumber;

    @BeforeEach
    void setUp() {
        lychrelNumber = new LychrelNumber(LIMIT_ITERATION);
    }

    @Test
    void should_determine_which_number_is_Lychrel() {
        assertThat(lychrelNumber.isLychrel(new BigInteger("56"))).isFalse();
        assertThat(lychrelNumber.isLychrel(new BigInteger("196"))).isTrue();
    }
}
