package androidx.lifecycle;

import android.os.Bundle;
import v0.InterfaceC0638c;

/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements InterfaceC0638c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3400b;

    public /* synthetic */ l0(Object obj, int i) {
        this.f3399a = i;
        this.f3400b = obj;
    }

    @Override // v0.InterfaceC0638c
    public final Bundle a() {
        int i = this.f3399a;
        Object obj = this.f3400b;
        switch (i) {
            case 0:
                return n0.a((n0) obj);
            default:
                return b.o.c((b.o) obj);
        }
    }
}
