package o0;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0524a implements F {

    /* renamed from: a, reason: collision with root package name */
    public final int f7972a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f7973b = new Bundle();

    public C0524a(int i) {
        this.f7972a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Intrinsics.areEqual(C0524a.class, obj.getClass()) && this.f7972a == ((C0524a) obj).f7972a;
    }

    @Override // o0.F
    public final int getActionId() {
        return this.f7972a;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        return this.f7973b;
    }

    public final int hashCode() {
        return 31 + this.f7972a;
    }

    public final String toString() {
        return C.w.p(new StringBuilder("ActionOnlyNavDirections(actionId="), this.f7972a, ')');
    }
}
