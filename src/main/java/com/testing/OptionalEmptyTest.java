package com.testing;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Optional;

public class OptionalEmptyTest {

    @Test
    public void testOptionalEmpty() {
        Optional<String> optional = Optional.empty();

        assertThat(optional).isEmpty(); // Aserción que verifica que el Optional está vacío
    }
}

