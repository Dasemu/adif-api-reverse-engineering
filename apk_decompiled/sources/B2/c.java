package B2;

import a.AbstractC0106b;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes3.dex */
public final class c extends AbstractC0106b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0106b f217c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f218d;

    public c(d dVar, Context context, TextPaint textPaint, AbstractC0106b abstractC0106b) {
        this.f218d = dVar;
        this.f215a = context;
        this.f216b = textPaint;
        this.f217c = abstractC0106b;
    }

    @Override // a.AbstractC0106b
    public final void y(int i) {
        this.f217c.y(i);
    }

    @Override // a.AbstractC0106b
    public final void z(Typeface typeface, boolean z3) {
        this.f218d.g(this.f215a, this.f216b, typeface);
        this.f217c.z(typeface, z3);
    }
}
