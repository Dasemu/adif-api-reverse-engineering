package e3;

import a.AbstractC0105a;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e3.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0322h {

    /* renamed from: c, reason: collision with root package name */
    public static final C0322h f6346c = new C0322h(CollectionsKt.toSet(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f6347a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0105a f6348b;

    public C0322h(Set pins, AbstractC0105a abstractC0105a) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f6347a = pins;
        this.f6348b = abstractC0105a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if (r12.charAt(r9 - 1) == '.') goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r4 == (-1)) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0018 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r12, kotlin.jvm.functions.Function0 r13) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.C0322h.a(java.lang.String, kotlin.jvm.functions.Function0):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0322h)) {
            return false;
        }
        C0322h c0322h = (C0322h) obj;
        return Intrinsics.areEqual(c0322h.f6347a, this.f6347a) && Intrinsics.areEqual(c0322h.f6348b, this.f6348b);
    }

    public final int hashCode() {
        int hashCode = (this.f6347a.hashCode() + 1517) * 41;
        AbstractC0105a abstractC0105a = this.f6348b;
        return hashCode + (abstractC0105a != null ? abstractC0105a.hashCode() : 0);
    }
}
