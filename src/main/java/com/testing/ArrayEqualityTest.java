package com.testing;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayEqualityTest {

    @Test
    public void testArrayEquality() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 4};

        assertThat(array1).isEqualTo(array2); // Aserción que demuestra que dos arrays son iguales
        assertThat(array1).isNotEqualTo(array3); // Aserción que demuestra que dos arrays no son iguales
    }
}
