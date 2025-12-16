package b;

import O.C0072m;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.t0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class n extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f4127b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i) {
        super(0);
        this.f4126a = i;
        this.f4127b = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        j jVar;
        switch (this.f4126a) {
            case 0:
                o oVar = this.f4127b;
                return new t0(oVar.getApplication(), oVar, oVar.getIntent() != null ? oVar.getIntent().getExtras() : null);
            case 1:
                this.f4127b.reportFullyDrawn();
                return Unit.INSTANCE;
            case 2:
                o oVar2 = this.f4127b;
                jVar = oVar2.reportFullyDrawnExecutor;
                return new q(jVar, new n(oVar2, 1));
            default:
                o oVar3 = this.f4127b;
                B b4 = new B(new RunnableC0255d(oVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        oVar3.getLifecycle().a(new C0072m(1, b4, oVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new F.n(2, oVar3, b4));
                    }
                }
                return b4;
        }
    }
}
