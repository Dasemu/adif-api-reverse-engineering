package P;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f1326a;

    /* renamed from: b, reason: collision with root package name */
    public final k f1327b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1328c;

    public a(int i, k kVar, int i4) {
        this.f1326a = i;
        this.f1327b = kVar;
        this.f1328c = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1326a);
        this.f1327b.f1341a.performAction(this.f1328c, bundle);
    }
}
