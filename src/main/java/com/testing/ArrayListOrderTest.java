package com.testing;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;

public class ArrayListOrderTest {

    @Test
    public void testArrayListOrder() {
        List<Object> list = new ArrayList<>();
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();

        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        assertThat(list).containsExactly(obj1, obj2, obj3); // Verificar el orden de los objetos
        assertThat(list).containsOnly(obj1, obj2, obj3); // Verifica que la lista contiene los objetos en cualquier orden
        assertThat(list).doesNotContain(obj4); // Verifica que la lista no contiene un objeto
    }
}

