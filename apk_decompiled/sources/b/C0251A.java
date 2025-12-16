package b;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: b.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0251A extends FunctionReferenceImpl implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0251A(int i, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(i, obj, cls, str, str2, i4);
        this.f4095a = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4095a) {
            case 0:
                ((B) this.receiver).f();
                return Unit.INSTANCE;
            default:
                ((B) this.receiver).f();
                return Unit.INSTANCE;
        }
    }
}
