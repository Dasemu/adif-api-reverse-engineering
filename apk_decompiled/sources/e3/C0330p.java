package e3;

import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e3.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0330p {

    /* renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f6390a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f6391b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f6392c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f6393d = new ArrayDeque();

    public final void a(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            Unit unit = Unit.INSTANCE;
        }
        c();
    }

    public final void b(i3.g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.f6856b.decrementAndGet();
        a(this.f6392c, call);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.C0330p.c():void");
    }
}
