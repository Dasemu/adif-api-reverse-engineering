package o0;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.adif.elcanomovil.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: o0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526c extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0526c f7976b = new C0526c(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0526c f7977c = new C0526c(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0526c f7978d = new C0526c(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final C0526c f7979e = new C0526c(1, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final C0526c f7980f = new C0526c(1, 4);

    /* renamed from: g, reason: collision with root package name */
    public static final C0526c f7981g = new C0526c(1, 5);
    public static final C0526c h = new C0526c(1, 6);
    public static final C0526c i = new C0526c(1, 7);

    /* renamed from: j, reason: collision with root package name */
    public static final C0526c f7982j = new C0526c(1, 8);

    /* renamed from: k, reason: collision with root package name */
    public static final C0526c f7983k = new C0526c(1, 9);

    /* renamed from: l, reason: collision with root package name */
    public static final C0526c f7984l = new C0526c(1, 10);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7985a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0526c(int i4, int i5) {
        super(i4);
        this.f7985a = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7985a) {
            case 0:
                Context it = (Context) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof ContextWrapper) {
                    return ((ContextWrapper) it).getBaseContext();
                }
                return null;
            case 1:
                Context it2 = (Context) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof ContextWrapper) {
                    return ((ContextWrapper) it2).getBaseContext();
                }
                return null;
            case 2:
                C0527d anim = (C0527d) obj;
                Intrinsics.checkNotNullParameter(anim, "$this$anim");
                anim.f7986a = 0;
                anim.f7987b = 0;
                return Unit.INSTANCE;
            case 3:
                X popUpTo = (X) obj;
                Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                popUpTo.f7968a = true;
                return Unit.INSTANCE;
            case 4:
                E destination = (E) obj;
                Intrinsics.checkNotNullParameter(destination, "destination");
                H h4 = destination.f7921b;
                if (h4 == null || h4.f7932l != destination.h) {
                    return null;
                }
                return h4;
            case 5:
                E destination2 = (E) obj;
                Intrinsics.checkNotNullParameter(destination2, "destination");
                H h5 = destination2.f7921b;
                if (h5 == null || h5.f7932l != destination2.h) {
                    return null;
                }
                return h5;
            case 6:
                E it3 = (E) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return it3.f7921b;
            case 7:
                E it4 = (E) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof H)) {
                    return null;
                }
                H h6 = (H) it4;
                return h6.j(h6.f7932l, true);
            case 8:
                View it5 = (View) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                Object parent = it5.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 9:
                View it6 = (View) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                Object tag = it6.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (AbstractC0544v) ((WeakReference) tag).get();
                }
                if (tag instanceof AbstractC0544v) {
                    return (AbstractC0544v) tag;
                }
                return null;
            default:
                L navOptions = (L) obj;
                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                navOptions.f7945b = true;
                return Unit.INSTANCE;
        }
    }
}
