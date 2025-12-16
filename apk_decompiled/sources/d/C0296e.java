package d;

import e.AbstractC0311a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0293b f6095a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0311a f6096b;

    public C0296e(AbstractC0311a contract, InterfaceC0293b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(contract, "contract");
        this.f6095a = callback;
        this.f6096b = contract;
    }
}
