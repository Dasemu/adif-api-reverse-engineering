package U;

import android.os.Parcel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class p extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final p f1762b = new p(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final p f1763c = new p(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1764a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, int i4) {
        super(i);
        this.f1764a = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1764a) {
            case 0:
                Parcel it = (Parcel) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return new n(it);
            default:
                Parcel it2 = (Parcel) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return new r(it2);
        }
    }
}
