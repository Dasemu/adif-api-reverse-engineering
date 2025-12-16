package r0;

import a.AbstractC0106b;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o0.AbstractC0544v;
import o0.E;
import o0.r;
import z2.AbstractC0681k;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0565a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f8203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0544v f8204b;

    public C0565a(WeakReference weakReference, AbstractC0544v abstractC0544v) {
        this.f8203a = weakReference;
        this.f8204b = abstractC0544v;
    }

    @Override // o0.r
    public final void a(AbstractC0544v controller, E destination, Bundle bundle) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(destination, "destination");
        AbstractC0681k abstractC0681k = (AbstractC0681k) this.f8203a.get();
        if (abstractC0681k == null) {
            AbstractC0544v abstractC0544v = this.f8204b;
            abstractC0544v.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            abstractC0544v.f8061q.remove(this);
            return;
        }
        Menu menu = abstractC0681k.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "view.menu");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            Intrinsics.checkExpressionValueIsNotNull(item, "getItem(index)");
            if (AbstractC0106b.u(destination, item.getItemId())) {
                item.setChecked(true);
            }
        }
    }
}
