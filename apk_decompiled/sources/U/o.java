package U;

import android.os.Parcel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class o extends FunctionReferenceImpl implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Parcel dest = (Parcel) obj;
        int intValue = ((Number) obj2).intValue();
        Intrinsics.checkNotNullParameter(dest, "p0");
        n nVar = (n) this.receiver;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(dest, "dest");
        long[] jArr = nVar.f1758a;
        dest.writeInt(jArr.length);
        dest.writeLongArray(jArr);
        dest.writeTypedArray(nVar.f1759b, intValue);
        dest.writeInt(nVar.f1760c ? 1 : 0);
        dest.writeInt(nVar.f1761d);
        return Unit.INSTANCE;
    }
}
