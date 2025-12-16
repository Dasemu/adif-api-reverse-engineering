package R0;

import a.AbstractC0106b;
import e3.A;
import e3.C0317c;
import e3.z;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f1392b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i) {
        super(0);
        this.f1391a = i;
        this.f1392b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b bVar = this.f1392b;
        switch (this.f1391a) {
            case 0:
                C0317c c0317c = C0317c.f6330n;
                return AbstractC0106b.A(bVar.f1398f);
            default:
                String a2 = bVar.f1398f.a("Content-Type");
                if (a2 == null) {
                    return null;
                }
                Pattern pattern = A.f6197d;
                Intrinsics.checkNotNullParameter(a2, "<this>");
                try {
                    return z.a(a2);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }
}
