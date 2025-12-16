package androidx.navigation.fragment;

import C.w;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.AbstractC0158l0;
import androidx.fragment.app.C0142d0;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y;
import androidx.fragment.app.q0;
import androidx.lifecycle.C;
import androidx.navigation.fragment.DialogFragmentNavigator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import o0.C0537n;
import o0.C0539p;
import o0.C0540q;
import o0.E;
import o0.K;
import o0.U;
import o0.V;
import q0.C0555b;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator;", "Lo0/V;", "Lq0/b;", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@U("dialog")
/* loaded from: classes.dex */
public final class DialogFragmentNavigator extends V {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3446c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0158l0 f3447d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f3448e;

    /* renamed from: f, reason: collision with root package name */
    public final C0539p f3449f;

    public DialogFragmentNavigator(Context context, AbstractC0158l0 fragmentManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f3446c = context;
        this.f3447d = fragmentManager;
        this.f3448e = new LinkedHashSet();
        this.f3449f = new C0539p(this, 1);
    }

    @Override // o0.V
    public final E a() {
        Intrinsics.checkNotNullParameter(this, "fragmentNavigator");
        return new E(this);
    }

    @Override // o0.V
    public final void d(List entries, K k4) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        AbstractC0158l0 abstractC0158l0 = this.f3447d;
        if (abstractC0158l0.Q()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            C0537n c0537n = (C0537n) it.next();
            C0555b c0555b = (C0555b) c0537n.f8006b;
            String str = c0555b.f8147k;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set");
            }
            char charAt = str.charAt(0);
            Context context = this.f3446c;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            C0142d0 J = abstractC0158l0.J();
            context.getClassLoader();
            androidx.fragment.app.K a2 = J.a(str);
            Intrinsics.checkNotNullExpressionValue(a2, "fragmentManager.fragment…ader, className\n        )");
            if (!DialogInterfaceOnCancelListenerC0174y.class.isAssignableFrom(a2.getClass())) {
                StringBuilder sb = new StringBuilder("Dialog destination ");
                String str2 = c0555b.f8147k;
                if (str2 == null) {
                    throw new IllegalStateException("DialogFragment class was not set");
                }
                throw new IllegalArgumentException(w.r(sb, str2, " is not an instance of DialogFragment").toString());
            }
            DialogInterfaceOnCancelListenerC0174y dialogInterfaceOnCancelListenerC0174y = (DialogInterfaceOnCancelListenerC0174y) a2;
            dialogInterfaceOnCancelListenerC0174y.setArguments(c0537n.f8007c);
            dialogInterfaceOnCancelListenerC0174y.getLifecycle().a(this.f3449f);
            dialogInterfaceOnCancelListenerC0174y.show(abstractC0158l0, c0537n.f8010f);
            b().e(c0537n);
        }
    }

    @Override // o0.V
    public final void e(C0540q state) {
        C lifecycle;
        Intrinsics.checkNotNullParameter(state, "state");
        super.e(state);
        Iterator it = ((List) state.f8026e.getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            AbstractC0158l0 abstractC0158l0 = this.f3447d;
            if (!hasNext) {
                abstractC0158l0.p.add(new q0() { // from class: q0.a
                    @Override // androidx.fragment.app.q0
                    public final void a(AbstractC0158l0 abstractC0158l02, androidx.fragment.app.K childFragment) {
                        DialogFragmentNavigator this$0 = DialogFragmentNavigator.this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(abstractC0158l02, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(childFragment, "childFragment");
                        LinkedHashSet linkedHashSet = this$0.f3448e;
                        if (TypeIntrinsics.asMutableCollection(linkedHashSet).remove(childFragment.getTag())) {
                            childFragment.getLifecycle().a(this$0.f3449f);
                        }
                    }
                });
                return;
            }
            C0537n c0537n = (C0537n) it.next();
            DialogInterfaceOnCancelListenerC0174y dialogInterfaceOnCancelListenerC0174y = (DialogInterfaceOnCancelListenerC0174y) abstractC0158l0.F(c0537n.f8010f);
            if (dialogInterfaceOnCancelListenerC0174y == null || (lifecycle = dialogInterfaceOnCancelListenerC0174y.getLifecycle()) == null) {
                this.f3448e.add(c0537n.f8010f);
            } else {
                lifecycle.a(this.f3449f);
            }
        }
    }

    @Override // o0.V
    public final void i(C0537n popUpTo, boolean z3) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        AbstractC0158l0 abstractC0158l0 = this.f3447d;
        if (abstractC0158l0.Q()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().f8026e.getValue();
        Iterator it = CollectionsKt.reversed(list.subList(list.indexOf(popUpTo), list.size())).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.K F3 = abstractC0158l0.F(((C0537n) it.next()).f8010f);
            if (F3 != null) {
                F3.getLifecycle().c(this.f3449f);
                ((DialogInterfaceOnCancelListenerC0174y) F3).dismiss();
            }
        }
        b().c(popUpTo, z3);
    }
}
