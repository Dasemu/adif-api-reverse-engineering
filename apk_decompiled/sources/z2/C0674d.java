package z2;

import C.w;
import android.content.Context;
import android.view.SubMenu;
import l.m;
import l.o;

/* renamed from: z2.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0674d extends m {

    /* renamed from: A, reason: collision with root package name */
    public final int f9050A;

    /* renamed from: z, reason: collision with root package name */
    public final Class f9051z;

    public C0674d(Context context, Class cls, int i) {
        super(context);
        this.f9051z = cls;
        this.f9050A = i;
    }

    @Override // l.m
    public final o a(int i, int i4, int i5, CharSequence charSequence) {
        int size = this.f7246f.size() + 1;
        int i6 = this.f9050A;
        if (size <= i6) {
            w();
            o a2 = super.a(i, i4, i5, charSequence);
            a2.f(true);
            v();
            return a2;
        }
        String simpleName = this.f9051z.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i6);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(w.r(sb, simpleName, "#getMaxItemCount()"));
    }

    @Override // l.m, android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i5, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f9051z.getSimpleName().concat(" does not support submenus"));
    }
}
