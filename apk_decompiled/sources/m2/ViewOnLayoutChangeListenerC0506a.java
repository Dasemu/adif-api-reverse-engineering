package m2;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import k2.C0417a;
import n2.C0514a;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnLayoutChangeListenerC0506a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7805b;

    public /* synthetic */ ViewOnLayoutChangeListenerC0506a(Object obj, int i) {
        this.f7804a = i;
        this.f7805b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        C0417a c0417a;
        switch (this.f7804a) {
            case 0:
                throw null;
            default:
                C0514a c0514a = (C0514a) this.f7805b;
                ImageView imageView = c0514a.f9038n;
                if (imageView.getVisibility() != 0 || (c0417a = c0514a.f9026F) == null) {
                    return;
                }
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                c0417a.setBounds(rect);
                c0417a.i(imageView, null);
                return;
        }
    }
}
