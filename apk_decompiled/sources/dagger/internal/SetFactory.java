package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class SetFactory<T> implements Factory<Set<T>> {
    private static final Factory<Set<Object>> EMPTY_FACTORY = InstanceFactory.create(Collections.EMPTY_SET);
    private final List<Provider<Collection<T>>> collectionProviders;
    private final List<Provider<T>> individualProviders;

    /* loaded from: classes3.dex */
    public static final class Builder<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final List<Provider<Collection<T>>> collectionProviders;
        private final List<Provider<T>> individualProviders;

        public Builder<T> addCollectionProvider(Provider<? extends Collection<? extends T>> provider) {
            this.collectionProviders.add(provider);
            return this;
        }

        public Builder<T> addProvider(Provider<? extends T> provider) {
            this.individualProviders.add(provider);
            return this;
        }

        public SetFactory<T> build() {
            return new SetFactory<>(this.individualProviders, this.collectionProviders);
        }

        private Builder(int i, int i4) {
            this.individualProviders = DaggerCollections.presizedList(i);
            this.collectionProviders = DaggerCollections.presizedList(i4);
        }

        @Deprecated
        public Builder<T> addCollectionProvider(javax.inject.Provider<? extends Collection<? extends T>> provider) {
            return addCollectionProvider((Provider) Providers.asDaggerProvider(provider));
        }

        @Deprecated
        public Builder<T> addProvider(javax.inject.Provider<? extends T> provider) {
            return addProvider((Provider) Providers.asDaggerProvider(provider));
        }
    }

    public static <T> Builder<T> builder(int i, int i4) {
        return new Builder<>(i, i4);
    }

    public static <T> Factory<Set<T>> empty() {
        return (Factory<Set<T>>) EMPTY_FACTORY;
    }

    private SetFactory(List<Provider<T>> list, List<Provider<Collection<T>>> list2) {
        this.individualProviders = list;
        this.collectionProviders = list2;
    }

    @Override // javax.inject.Provider
    public Set<T> get() {
        int size = this.individualProviders.size();
        ArrayList arrayList = new ArrayList(this.collectionProviders.size());
        int size2 = this.collectionProviders.size();
        for (int i = 0; i < size2; i++) {
            Collection<T> collection = this.collectionProviders.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet newHashSetWithExpectedSize = DaggerCollections.newHashSetWithExpectedSize(size);
        int size3 = this.individualProviders.size();
        for (int i4 = 0; i4 < size3; i4++) {
            newHashSetWithExpectedSize.add(Preconditions.checkNotNull(this.individualProviders.get(i4).get()));
        }
        int size4 = arrayList.size();
        for (int i5 = 0; i5 < size4; i5++) {
            Iterator it = ((Collection) arrayList.get(i5)).iterator();
            while (it.hasNext()) {
                newHashSetWithExpectedSize.add(Preconditions.checkNotNull(it.next()));
            }
        }
        return Collections.unmodifiableSet(newHashSetWithExpectedSize);
    }
}
