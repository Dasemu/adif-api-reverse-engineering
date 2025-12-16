package androidx.lifecycle;

import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes.dex */
public final class m0 extends X {

    /* renamed from: l, reason: collision with root package name */
    public String f3401l;

    /* renamed from: m, reason: collision with root package name */
    public n0 f3402m;

    @Override // androidx.lifecycle.X, androidx.lifecycle.Q
    public final void j(Object obj) {
        n0 n0Var = this.f3402m;
        if (n0Var != null) {
            LinkedHashMap linkedHashMap = n0Var.f3404a;
            String str = this.f3401l;
            linkedHashMap.put(str, obj);
            MutableStateFlow mutableStateFlow = (MutableStateFlow) n0Var.f3407d.get(str);
            if (mutableStateFlow != null) {
                mutableStateFlow.setValue(obj);
            }
        }
        super.j(obj);
    }
}
