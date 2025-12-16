package r2;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0567a {

    /* renamed from: a, reason: collision with root package name */
    public C0.b f8212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f8213b;

    public C0567a(c cVar) {
        this.f8213b = cVar;
    }

    public final void a(Drawable drawable) {
        c cVar = this.f8213b;
        ColorStateList colorStateList = cVar.f8227o;
        if (colorStateList != null) {
            H.a.g(drawable, colorStateList.getColorForState(cVar.f8230s, colorStateList.getDefaultColor()));
        }
    }
}
