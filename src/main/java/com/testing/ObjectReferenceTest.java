package com.testing;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ObjectReferenceTest {

    @Test
    public void testObjectReference() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        Object obj3 = new Object();

        assertThat(obj1).isSameAs(obj2); // Aserción que demuestra que dos referencias son iguales
        assertThat(obj1).isNotSameAs(obj3); // Aserción que demuestra que dos referencias no son iguales
    }
}

