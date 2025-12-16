package b;

import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253b {

    /* renamed from: a, reason: collision with root package name */
    public final float f4106a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4107b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4108c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4109d;

    public C0253b(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        C0252a c0252a = C0252a.f4105a;
        float d4 = c0252a.d(backEvent);
        float e4 = c0252a.e(backEvent);
        float b4 = c0252a.b(backEvent);
        int c4 = c0252a.c(backEvent);
        this.f4106a = d4;
        this.f4107b = e4;
        this.f4108c = b4;
        this.f4109d = c4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f4106a);
        sb.append(", touchY=");
        sb.append(this.f4107b);
        sb.append(", progress=");
        sb.append(this.f4108c);
        sb.append(", swipeEdge=");
        return C.w.p(sb, this.f4109d, '}');
    }
}
