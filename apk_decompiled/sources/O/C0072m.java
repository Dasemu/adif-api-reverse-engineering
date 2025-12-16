package O;

import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0072m implements androidx.lifecycle.H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1269c;

    public /* synthetic */ C0072m(int i, Object obj, Object obj2) {
        this.f1267a = i;
        this.f1268b = obj;
        this.f1269c = obj2;
    }

    @Override // androidx.lifecycle.H
    public final void onStateChanged(androidx.lifecycle.J j4, androidx.lifecycle.A event) {
        switch (this.f1267a) {
            case 0:
                androidx.lifecycle.A a2 = androidx.lifecycle.A.ON_DESTROY;
                C0074o c0074o = (C0074o) this.f1268b;
                if (event == a2) {
                    c0074o.b((InterfaceC0076q) this.f1269c);
                    return;
                } else {
                    c0074o.getClass();
                    return;
                }
            default:
                b.B dispatcher = (b.B) this.f1268b;
                Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
                b.o this$0 = (b.o) this.f1269c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(j4, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == androidx.lifecycle.A.ON_CREATE) {
                    OnBackInvokedDispatcher invoker = b.g.f4115a.a(this$0);
                    dispatcher.getClass();
                    Intrinsics.checkNotNullParameter(invoker, "invoker");
                    dispatcher.f4100e = invoker;
                    dispatcher.e(dispatcher.f4102g);
                    return;
                }
                return;
        }
    }
}
