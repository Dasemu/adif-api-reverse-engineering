package W1;

import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class o implements Y1.b {
    @Override // javax.inject.Provider
    public final Object get() {
        return new q(Executors.newSingleThreadExecutor());
    }
}
