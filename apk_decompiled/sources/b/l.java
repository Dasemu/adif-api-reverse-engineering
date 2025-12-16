package b;

import android.content.Intent;
import android.content.IntentSender;
import d.C0296e;
import d.InterfaceC0293b;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import s0.C0582a;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4124c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4125d;

    public /* synthetic */ l(Object obj, int i, int i4, Object obj2) {
        this.f4122a = i4;
        this.f4123b = obj;
        this.f4124c = i;
        this.f4125d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4122a) {
            case 0:
                m this$0 = (m) this.f4123b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                A.a aVar = (A.a) this.f4125d;
                String str = (String) this$0.f6104a.get(Integer.valueOf(this.f4124c));
                if (str == null) {
                    return;
                }
                C0296e c0296e = (C0296e) this$0.f6108e.get(str);
                InterfaceC0293b interfaceC0293b = c0296e != null ? c0296e.f6095a : null;
                Object obj = aVar.f7b;
                if (interfaceC0293b == null) {
                    this$0.f6110g.remove(str);
                    this$0.f6109f.put(str, obj);
                    return;
                }
                InterfaceC0293b interfaceC0293b2 = c0296e.f6095a;
                Intrinsics.checkNotNull(interfaceC0293b2, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                if (this$0.f6107d.remove(str)) {
                    interfaceC0293b2.a(obj);
                    return;
                }
                return;
            case 1:
                m this$02 = (m) this.f4123b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                IntentSender.SendIntentException e4 = (IntentSender.SendIntentException) this.f4125d;
                Intrinsics.checkNotNullParameter(e4, "$e");
                this$02.a(this.f4124c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e4));
                return;
            default:
                ((C0582a) this.f4123b).f8360b.a(this.f4124c, (Serializable) this.f4125d);
                return;
        }
    }
}
