package dagger.internal;

import dagger.Lazy;
import dagger.internal.AbstractMapFactory;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class MapProviderFactory<K, V> extends AbstractMapFactory<K, V, Provider<V>> implements Lazy<Map<K, Provider<V>>> {

    /* loaded from: classes3.dex */
    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, Provider<V>> {
        public MapProviderFactory<K, V> build() {
            return new MapProviderFactory<>(this.map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dagger.internal.AbstractMapFactory.Builder
        public /* bridge */ /* synthetic */ AbstractMapFactory.Builder put(Object obj, Provider provider) {
            return put((Builder<K, V>) obj, provider);
        }

        private Builder(int i) {
            super(i);
        }

        @Override // dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> put(K k4, Provider<V> provider) {
            super.put((Builder<K, V>) k4, (Provider) provider);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> putAll(Provider<Map<K, Provider<V>>> provider) {
            super.putAll((Provider) provider);
            return this;
        }

        @Deprecated
        public Builder<K, V> put(K k4, javax.inject.Provider<V> provider) {
            return put((Builder<K, V>) k4, (Provider) Providers.asDaggerProvider(provider));
        }

        @Deprecated
        public Builder<K, V> putAll(final javax.inject.Provider<Map<K, javax.inject.Provider<V>>> provider) {
            return putAll((Provider) new Provider<Map<K, Provider<V>>>() { // from class: dagger.internal.MapProviderFactory.Builder.1
                @Override // javax.inject.Provider
                public Map<K, Provider<V>> get() {
                    Map map = (Map) provider.get();
                    if (map.isEmpty()) {
                        return Collections.EMPTY_MAP;
                    }
                    LinkedHashMap newLinkedHashMapWithExpectedSize = DaggerCollections.newLinkedHashMapWithExpectedSize(map.size());
                    for (Map.Entry<K, V> entry : map.entrySet()) {
                        newLinkedHashMapWithExpectedSize.put(entry.getKey(), Providers.asDaggerProvider((javax.inject.Provider) entry.getValue()));
                    }
                    return Collections.unmodifiableMap(newLinkedHashMapWithExpectedSize);
                }
            });
        }
    }

    public static <K, V> Builder<K, V> builder(int i) {
        return new Builder<>(i);
    }

    private MapProviderFactory(Map<K, Provider<V>> map) {
        super(map);
    }

    @Override // javax.inject.Provider
    public Map<K, Provider<V>> get() {
        return contributingMap();
    }
}
