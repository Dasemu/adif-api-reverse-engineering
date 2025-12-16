package s3;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import r3.C;

/* loaded from: classes3.dex */
public final class j extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f8496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f8497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f8498c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C f8499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f8500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f8501f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Ref.BooleanRef booleanRef, long j4, Ref.LongRef longRef, C c4, Ref.LongRef longRef2, Ref.LongRef longRef3) {
        super(2);
        this.f8496a = booleanRef;
        this.f8497b = j4;
        this.f8498c = longRef;
        this.f8499d = c4;
        this.f8500e = longRef2;
        this.f8501f = longRef3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            Ref.BooleanRef booleanRef = this.f8496a;
            if (booleanRef.element) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            booleanRef.element = true;
            if (longValue < this.f8497b) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            Ref.LongRef longRef = this.f8498c;
            long j4 = longRef.element;
            C c4 = this.f8499d;
            if (j4 == 4294967295L) {
                j4 = c4.O();
            }
            longRef.element = j4;
            Ref.LongRef longRef2 = this.f8500e;
            longRef2.element = longRef2.element == 4294967295L ? c4.O() : 0L;
            Ref.LongRef longRef3 = this.f8501f;
            longRef3.element = longRef3.element == 4294967295L ? c4.O() : 0L;
        }
        return Unit.INSTANCE;
    }
}
