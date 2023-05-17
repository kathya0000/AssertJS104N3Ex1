package com.testing;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SimpleClassTest {

    @Test
    public void testException() {
        SimpleClass simpleClass = new SimpleClass();

        assertThatThrownBy(() -> simpleClass.throwException())
                .isInstanceOf(ArrayIndexOutOfBoundsException.class); // Aserción que valida que se lanza la excepción
    }
}

