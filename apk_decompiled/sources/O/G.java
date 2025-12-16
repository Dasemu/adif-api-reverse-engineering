package O;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class G extends I {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1216e;

    public G(int i, Class cls, int i4, int i5, int i6) {
        this.f1216e = i6;
        this.f1218a = i;
        this.f1221d = cls;
        this.f1220c = i4;
        this.f1219b = i5;
    }

    @Override // O.I
    public final Object b(View view) {
        switch (this.f1216e) {
            case 0:
                return Q.b(view);
            case 1:
                return T.b(view);
            default:
                return Boolean.valueOf(Q.c(view));
        }
    }

    @Override // O.I
    public final void c(View view, Object obj) {
        switch (this.f1216e) {
            case 0:
                Q.h(view, (CharSequence) obj);
                return;
            case 1:
                T.e(view, (CharSequence) obj);
                return;
            default:
                Q.g(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override // O.I
    public final boolean e(Object obj, Object obj2) {
        switch (this.f1216e) {
            case 0:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return true ^ ((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }
    }
}
