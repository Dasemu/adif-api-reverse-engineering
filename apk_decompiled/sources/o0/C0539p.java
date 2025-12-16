package o0;

import android.util.Log;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y;
import androidx.navigation.fragment.DialogFragmentNavigator;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import v0.C0639d;

/* renamed from: o0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0539p implements androidx.lifecycle.H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8021b;

    public /* synthetic */ C0539p(Object obj, int i) {
        this.f8020a = i;
        this.f8021b = obj;
    }

    @Override // androidx.lifecycle.H
    public final void onStateChanged(androidx.lifecycle.J source, androidx.lifecycle.A event) {
        Object obj;
        switch (this.f8020a) {
            case 0:
                AbstractC0544v this$0 = (AbstractC0544v) this.f8021b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(source, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                androidx.lifecycle.B a2 = event.a();
                Intrinsics.checkNotNullExpressionValue(a2, "event.targetState");
                this$0.f8062r = a2;
                if (this$0.f8050c != null) {
                    Iterator<E> it = this$0.f8054g.iterator();
                    while (it.hasNext()) {
                        C0537n c0537n = (C0537n) it.next();
                        c0537n.getClass();
                        Intrinsics.checkNotNullParameter(event, "event");
                        androidx.lifecycle.B a4 = event.a();
                        Intrinsics.checkNotNullExpressionValue(a4, "event.targetState");
                        c0537n.f8008d = a4;
                        c0537n.b();
                    }
                    return;
                }
                return;
            case 1:
                DialogFragmentNavigator this$02 = (DialogFragmentNavigator) this.f8021b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == androidx.lifecycle.A.ON_CREATE) {
                    DialogInterfaceOnCancelListenerC0174y dialogInterfaceOnCancelListenerC0174y = (DialogInterfaceOnCancelListenerC0174y) source;
                    Iterable iterable = (Iterable) this$02.b().f8026e.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.areEqual(((C0537n) it2.next()).f8010f, dialogInterfaceOnCancelListenerC0174y.getTag())) {
                                return;
                            }
                        }
                    }
                    dialogInterfaceOnCancelListenerC0174y.dismiss();
                    return;
                }
                if (event == androidx.lifecycle.A.ON_STOP) {
                    DialogInterfaceOnCancelListenerC0174y dialogInterfaceOnCancelListenerC0174y2 = (DialogInterfaceOnCancelListenerC0174y) source;
                    if (dialogInterfaceOnCancelListenerC0174y2.requireDialog().isShowing()) {
                        return;
                    }
                    List list = (List) this$02.b().f8026e.getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj = listIterator.previous();
                            if (Intrinsics.areEqual(((C0537n) obj).f8010f, dialogInterfaceOnCancelListenerC0174y2.getTag())) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    if (obj == null) {
                        throw new IllegalStateException(("Dialog " + dialogInterfaceOnCancelListenerC0174y2 + " has already been popped off of the Navigation back stack").toString());
                    }
                    C0537n c0537n2 = (C0537n) obj;
                    if (!Intrinsics.areEqual(CollectionsKt.lastOrNull(list), c0537n2)) {
                        Log.i("DialogFragmentNavigator", "Dialog " + dialogInterfaceOnCancelListenerC0174y2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                    }
                    this$02.i(c0537n2, false);
                    return;
                }
                return;
            default:
                C0639d this$03 = (C0639d) this.f8021b;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(source, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == androidx.lifecycle.A.ON_START) {
                    this$03.f8634f = true;
                    return;
                } else {
                    if (event == androidx.lifecycle.A.ON_STOP) {
                        this$03.f8634f = false;
                        return;
                    }
                    return;
                }
        }
    }
}
