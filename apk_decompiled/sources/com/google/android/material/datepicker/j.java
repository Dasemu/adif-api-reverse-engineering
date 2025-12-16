package com.google.android.material.datepicker;

import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import g.C0360g;
import k.AbstractC0405b;
import m.Q0;
import z2.AbstractC0673c;

/* loaded from: classes3.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5657b;

    public /* synthetic */ j(Object obj, int i) {
        this.f5656a = i;
        this.f5657b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.f5656a) {
            case 0:
                k kVar = (k) this.f5657b;
                int i = kVar.f5661e;
                if (i == 2) {
                    kVar.g(1);
                    return;
                } else {
                    if (i == 1) {
                        kVar.g(2);
                        return;
                    }
                    return;
                }
            case 1:
                C0360g c0360g = (C0360g) this.f5657b;
                Message obtain = (view != c0360g.i || (message3 = c0360g.f6632k) == null) ? (view != c0360g.f6633l || (message2 = c0360g.f6635n) == null) ? (view != c0360g.f6636o || (message = c0360g.f6637q) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (obtain != null) {
                    obtain.sendToTarget();
                }
                c0360g.f6622E.obtainMessage(1, c0360g.f6625b).sendToTarget();
                return;
            case 2:
                ((AbstractC0405b) this.f5657b).a();
                return;
            case 3:
                Q0 q02 = ((Toolbar) this.f5657b).f2472M;
                l.o oVar = q02 == null ? null : q02.f7604b;
                if (oVar != null) {
                    oVar.collapseActionView();
                    return;
                }
                return;
            case 4:
                o2.e eVar = (o2.e) this.f5657b;
                if (eVar.f8094j && eVar.isShowing()) {
                    if (!eVar.f8096l) {
                        TypedArray obtainStyledAttributes = eVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        eVar.f8095k = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        eVar.f8096l = true;
                    }
                    if (eVar.f8095k) {
                        eVar.cancel();
                        return;
                    }
                    return;
                }
                return;
            default:
                l.o itemData = ((AbstractC0673c) view).getItemData();
                n2.b bVar = (n2.b) this.f5657b;
                if (bVar.f9058E.q(itemData, bVar.f9057D, 0)) {
                    return;
                }
                itemData.setChecked(true);
                return;
        }
    }
}
