package U;

import android.os.Parcel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class q extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f1765a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar) {
        super(2);
        this.f1765a = rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Parcel dest = (Parcel) obj;
        ((Number) obj2).intValue();
        Intrinsics.checkNotNullParameter(dest, "parcel");
        r rVar = this.f1765a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(dest, "dest");
        byte[] bArr = rVar.f1766a;
        dest.writeInt(bArr.length);
        dest.writeByteArray(bArr);
        dest.writeString(rVar.f1767b);
        dest.writeLong(rVar.f1768c);
        return Unit.INSTANCE;
    }
}
