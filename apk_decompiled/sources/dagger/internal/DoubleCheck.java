package dagger.internal;

import dagger.Lazy;

/* loaded from: classes3.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile Provider<T> provider;

    private DoubleCheck(Provider<T> provider) {
        this.provider = provider;
    }

    public static <P extends Provider<T>, T> Lazy<T> lazy(P p) {
        if (p instanceof Lazy) {
            return (Lazy) p;
        }
        return new DoubleCheck((Provider) Preconditions.checkNotNull(p));
    }

    public static <P extends Provider<T>, T> Provider<T> provider(P p) {
        Preconditions.checkNotNull(p);
        return p instanceof DoubleCheck ? p : new DoubleCheck(p);
    }

    private static Object reentrantCheck(Object obj, Object obj2) {
        if (obj == UNINITIALIZED || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t2;
        T t4 = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t4 != obj) {
            return t4;
        }
        synchronized (this) {
            try {
                t2 = (T) this.instance;
                if (t2 == obj) {
                    t2 = this.provider.get();
                    this.instance = reentrantCheck(this.instance, t2);
                    this.provider = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t2;
    }

    @Deprecated
    public static <P extends javax.inject.Provider<T>, T> Lazy<T> lazy(P p) {
        return lazy(Providers.asDaggerProvider(p));
    }

    @Deprecated
    public static <P extends javax.inject.Provider<T>, T> javax.inject.Provider<T> provider(P p) {
        return provider(Providers.asDaggerProvider(p));
    }
}
