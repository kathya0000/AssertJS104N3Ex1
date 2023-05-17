package com.testing;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class IntegerEqualityTest {

    @Test
    public void testIntegerEquality() {
        Integer a = 5;
        Integer b = 5;
        Integer c = 6;

        assertThat(a).isEqualTo(b); // Aserción que demuestra que dos enteros son iguales
        assertThat(a).isNotEqualTo(c); // Aserción que demuestra que dos enteros no son iguales
    }
}
