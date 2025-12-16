package e3;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import r3.C0572d;
import r3.C0579k;
import r3.InterfaceC0577i;

/* loaded from: classes3.dex */
public final class J extends M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f6274b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6275c;

    public /* synthetic */ J(A a2, Object obj, int i) {
        this.f6273a = i;
        this.f6274b = a2;
        this.f6275c = obj;
    }

    @Override // e3.M
    public final long contentLength() {
        switch (this.f6273a) {
            case 0:
                return ((File) this.f6275c).length();
            default:
                return ((C0579k) this.f6275c).d();
        }
    }

    @Override // e3.M
    public final A contentType() {
        switch (this.f6273a) {
            case 0:
                return this.f6274b;
            default:
                return this.f6274b;
        }
    }

    @Override // e3.M
    public final void writeTo(InterfaceC0577i sink) {
        Object obj = this.f6275c;
        int i = this.f6273a;
        Intrinsics.checkNotNullParameter(sink, "sink");
        switch (i) {
            case 0:
                Logger logger = r3.w.f8315a;
                File file = (File) obj;
                Intrinsics.checkNotNullParameter(file, "<this>");
                C0572d c0572d = new C0572d(new FileInputStream(file), r3.K.f8261d);
                try {
                    sink.D(c0572d);
                    CloseableKt.closeFinally(c0572d, null);
                    return;
                } finally {
                }
            default:
                sink.F((C0579k) obj);
                return;
        }
    }
}
