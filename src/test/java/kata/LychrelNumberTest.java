package kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LychrelNumberTest {

    private LychrelNumber lychrelNumber;

    @BeforeEach
    void setUp() {
        lychrelNumber = new LychrelNumber();
    }

    @Test
    void should_determine_which_number_is_Lychrel() {
        assertThat(lychrelNumber.isLychrel(56)).isFalse();
        assertThat(lychrelNumber.isLychrel(196)).isTrue();
    }
}
