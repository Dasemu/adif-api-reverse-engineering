package s3;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import r3.C;

/* loaded from: classes3.dex */
public final class k extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f8502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f8503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f8504c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f8505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C c4, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        super(2);
        this.f8502a = c4;
        this.f8503b = objectRef;
        this.f8504c = objectRef2;
        this.f8505d = objectRef3;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v9, types: [T, java.lang.Long] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 21589) {
            if (longValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte readByte = this.f8502a.readByte();
            boolean z3 = (readByte & 1) == 1;
            boolean z4 = (readByte & 2) == 2;
            boolean z5 = (readByte & 4) == 4;
            long j4 = z3 ? 5L : 1L;
            if (z4) {
                j4 += 4;
            }
            if (z5) {
                j4 += 4;
            }
            if (longValue < j4) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z3) {
                this.f8503b.element = Long.valueOf(r2.x() * 1000);
            }
            if (z4) {
                this.f8504c.element = Long.valueOf(r2.x() * 1000);
            }
            if (z5) {
                this.f8505d.element = Long.valueOf(r2.x() * 1000);
            }
        }
        return Unit.INSTANCE;
    }
}
