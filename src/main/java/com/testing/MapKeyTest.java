package com.testing;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class MapKeyTest {

    @Test
    public void testMapContainsKey() {
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);

        assertThat(map).containsKey("key1"); // Verifica que la clave está en el mapa
        assertThat(map).doesNotContainKey("key2"); // Verifica que la clave no está en el mapa
    }
}

