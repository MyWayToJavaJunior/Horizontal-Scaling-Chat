package otus.project.horizontal_scaling_chat.utils;

import java.util.HashMap;
import java.util.Map;

// Scant substitution of Java 9 Map.ofEntries, Map.entry
public class MapBuilder<K, V> {
    private Map<K, V> map = new HashMap<>();

    public MapBuilder<K, V> put(K key, V value) {
        map.put(key, value);
        return this;
    }

    public Map<K, V> build() {
        return map;
    }
}
