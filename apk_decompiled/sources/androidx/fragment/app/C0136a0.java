package androidx.fragment.app;

import android.util.Log;
import d.C0292a;
import d.InterfaceC0293b;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: androidx.fragment.app.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136a0 implements InterfaceC0293b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0158l0 f3089b;

    public /* synthetic */ C0136a0(AbstractC0158l0 abstractC0158l0, int i) {
        this.f3088a = i;
        this.f3089b = abstractC0158l0;
    }

    @Override // d.InterfaceC0293b
    public final void a(Object obj) {
        switch (this.f3088a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                AbstractC0158l0 abstractC0158l0 = this.f3089b;
                C0148g0 c0148g0 = (C0148g0) abstractC0158l0.f3148F.pollFirst();
                if (c0148g0 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                u0 u0Var = abstractC0158l0.f3160c;
                String str = c0148g0.f3122a;
                K c4 = u0Var.c(str);
                if (c4 != null) {
                    c4.onRequestPermissionsResult(c0148g0.f3123b, strArr, iArr);
                    return;
                }
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            case 1:
                C0292a c0292a = (C0292a) obj;
                AbstractC0158l0 abstractC0158l02 = this.f3089b;
                C0148g0 c0148g02 = (C0148g0) abstractC0158l02.f3148F.pollLast();
                if (c0148g02 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                u0 u0Var2 = abstractC0158l02.f3160c;
                String str2 = c0148g02.f3122a;
                K c5 = u0Var2.c(str2);
                if (c5 != null) {
                    c5.onActivityResult(c0148g02.f3123b, c0292a.f6089a, c0292a.f6090b);
                    return;
                }
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                return;
            default:
                C0292a c0292a2 = (C0292a) obj;
                AbstractC0158l0 abstractC0158l03 = this.f3089b;
                C0148g0 c0148g03 = (C0148g0) abstractC0158l03.f3148F.pollFirst();
                if (c0148g03 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                u0 u0Var3 = abstractC0158l03.f3160c;
                String str3 = c0148g03.f3122a;
                K c6 = u0Var3.c(str3);
                if (c6 != null) {
                    c6.onActivityResult(c0148g03.f3123b, c0292a2.f6089a, c0292a2.f6090b);
                    return;
                }
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                return;
        }
    }
}
