package dagger.internal;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class MapBuilder<K, V> {
    private final Map<K, V> contributions;

    private MapBuilder(int i) {
        this.contributions = DaggerCollections.newLinkedHashMapWithExpectedSize(i);
    }

    public static <K, V> MapBuilder<K, V> newMapBuilder(int i) {
        return new MapBuilder<>(i);
    }

    public Map<K, V> build() {
        return this.contributions.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.contributions);
    }

    public MapBuilder<K, V> put(K k4, V v3) {
        this.contributions.put(k4, v3);
        return this;
    }

    public MapBuilder<K, V> putAll(Map<K, V> map) {
        this.contributions.putAll(map);
        return this;
    }
}
