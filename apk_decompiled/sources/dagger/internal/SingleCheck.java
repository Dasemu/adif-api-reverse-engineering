package dagger.internal;

/* loaded from: classes3.dex */
public final class SingleCheck<T> implements Provider<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile Provider<T> provider;

    private SingleCheck(Provider<T> provider) {
        this.provider = provider;
    }

    public static <P extends Provider<T>, T> Provider<T> provider(P p) {
        return ((p instanceof SingleCheck) || (p instanceof DoubleCheck)) ? p : new SingleCheck((Provider) Preconditions.checkNotNull(p));
    }

    @Override // javax.inject.Provider
    public T get() {
        T t2 = (T) this.instance;
        if (t2 != UNINITIALIZED) {
            return t2;
        }
        Provider<T> provider = this.provider;
        if (provider == null) {
            return (T) this.instance;
        }
        T t4 = provider.get();
        this.instance = t4;
        this.provider = null;
        return t4;
    }

    public static <P extends javax.inject.Provider<T>, T> javax.inject.Provider<T> provider(P p) {
        return provider(Providers.asDaggerProvider(p));
    }
}
