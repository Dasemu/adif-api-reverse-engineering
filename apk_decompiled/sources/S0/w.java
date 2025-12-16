package S0;

import android.os.Looper;
import android.view.View;
import androidx.lifecycle.C;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class w implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public t f1533a;

    /* renamed from: b, reason: collision with root package name */
    public Job f1534b;

    /* renamed from: c, reason: collision with root package name */
    public u f1535c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1536d;

    /* JADX WARN: Type inference failed for: r0v2, types: [S0.t, java.lang.Object] */
    public final synchronized t a(Deferred deferred) {
        t tVar = this.f1533a;
        if (tVar != null && Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()) && this.f1536d) {
            this.f1536d = false;
            tVar.f1526a = deferred;
            return tVar;
        }
        Job job = this.f1534b;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f1534b = null;
        ?? obj = new Object();
        obj.f1526a = deferred;
        this.f1533a = obj;
        return obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        u uVar = this.f1535c;
        if (uVar == null) {
            return;
        }
        this.f1536d = true;
        uVar.f1527a.b(uVar.f1528b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        u uVar = this.f1535c;
        if (uVar != null) {
            Job.DefaultImpls.cancel$default(uVar.f1531e, (CancellationException) null, 1, (Object) null);
            C c4 = uVar.f1530d;
            U0.a aVar = uVar.f1529c;
            if (aVar != null) {
                c4.c(aVar);
            }
            c4.c(uVar);
        }
    }
}
