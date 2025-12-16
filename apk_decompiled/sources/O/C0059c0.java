package O;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: O.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059c0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0059c0 f1234a = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return new C0061d0(viewGroup);
        }
        return null;
    }
}
