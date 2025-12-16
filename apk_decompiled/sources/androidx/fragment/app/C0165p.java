package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165p extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0167q f3197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3199c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f3200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0165p(C0167q c0167q, ViewGroup viewGroup, Object obj, Ref.ObjectRef objectRef) {
        super(0);
        this.f3197a = c0167q;
        this.f3198b = viewGroup;
        this.f3199c = obj;
        this.f3200d = objectRef;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, a0.b] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C0167q c0167q = this.f3197a;
        E0 e02 = c0167q.f3211f;
        ViewGroup viewGroup = this.f3198b;
        Object obj = this.f3199c;
        Object i = e02.i(viewGroup, obj);
        c0167q.f3219q = i;
        if (i == null) {
            throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
        }
        this.f3200d.element = new a0.b(1, c0167q, viewGroup);
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Started executing operations from " + c0167q.f3209d + " to " + c0167q.f3210e);
        }
        return Unit.INSTANCE;
    }
}
