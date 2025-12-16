package androidx.appcompat.view.menu;

import R0.h;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import l.InterfaceC0418A;
import l.InterfaceC0434l;
import l.m;
import l.o;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0434l, InterfaceC0418A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2344b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public m f2345a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        h l4 = h.l(context, attributeSet, f2344b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) l4.f1414b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(l4.f(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(l4.f(1));
        }
        l4.n();
    }

    @Override // l.InterfaceC0418A
    public final void a(m mVar) {
        this.f2345a = mVar;
    }

    @Override // l.InterfaceC0434l
    public final boolean c(o oVar) {
        return this.f2345a.q(oVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        c((o) getAdapter().getItem(i));
    }
}
