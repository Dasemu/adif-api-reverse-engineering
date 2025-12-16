package a1;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.jvm.internal.Intrinsics;
import t3.b;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107a extends b {

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseCrashlytics f2329b;

    public C0107a(FirebaseCrashlytics firebaseCrashlytics) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "firebaseCrashlytics");
        this.f2329b = firebaseCrashlytics;
    }

    @Override // t3.b
    public final void c(int i, String str, String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        FirebaseCrashlytics firebaseCrashlytics = this.f2329b;
        if (th != null) {
            firebaseCrashlytics.recordException(th);
        } else if (i == 6) {
            firebaseCrashlytics.recordException(new Exception(str));
        }
    }
}
