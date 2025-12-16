package b;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class t extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f4137b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(B b4, int i) {
        super(0);
        this.f4136a = i;
        this.f4137b = b4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4136a) {
            case 0:
                this.f4137b.d();
                return Unit.INSTANCE;
            case 1:
                this.f4137b.c();
                return Unit.INSTANCE;
            default:
                this.f4137b.d();
                return Unit.INSTANCE;
        }
    }
}
