package dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class AbstractMapFactory<K, V, V2> implements Factory<Map<K, V2>> {
    private final Map<K, Provider<V>> contributingMap;

    /* loaded from: classes3.dex */
    public static abstract class Builder<K, V, V2> {
        final LinkedHashMap<K, Provider<V>> map;

        public Builder(int i) {
            this.map = DaggerCollections.newLinkedHashMapWithExpectedSize(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder<K, V, V2> put(K k4, Provider<V> provider) {
            this.map.put(Preconditions.checkNotNull(k4, "key"), Preconditions.checkNotNull(provider, "provider"));
            return this;
        }

        public Builder<K, V, V2> putAll(Provider<Map<K, V2>> provider) {
            if (provider instanceof DelegateFactory) {
                return putAll(((DelegateFactory) provider).getDelegate());
            }
            this.map.putAll(((AbstractMapFactory) provider).contributingMap);
            return this;
        }
    }

    public AbstractMapFactory(Map<K, Provider<V>> map) {
        this.contributingMap = Collections.unmodifiableMap(map);
    }

    public final Map<K, Provider<V>> contributingMap() {
        return this.contributingMap;
    }
}
