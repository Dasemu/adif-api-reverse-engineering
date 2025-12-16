package androidx.appcompat.widget;

import O.h0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import g.C0372t;
import g.LayoutInflaterFactory2C0351E;
import l.m;
import m.C0462g;
import m.C0472l;
import m.InterfaceC0455c0;
import m.InterfaceC0457d0;
import m.V0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f2438a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f2439b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f2440c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f2441d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f2442e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f2443f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f2444g;
    public InterfaceC0455c0 h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2444g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2442e == null) {
            this.f2442e = new TypedValue();
        }
        return this.f2442e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2443f == null) {
            this.f2443f = new TypedValue();
        }
        return this.f2443f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2440c == null) {
            this.f2440c = new TypedValue();
        }
        return this.f2440c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2441d == null) {
            this.f2441d = new TypedValue();
        }
        return this.f2441d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2438a == null) {
            this.f2438a = new TypedValue();
        }
        return this.f2438a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2439b == null) {
            this.f2439b = new TypedValue();
        }
        return this.f2439b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0455c0 interfaceC0455c0 = this.h;
        if (interfaceC0455c0 != null) {
            interfaceC0455c0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0472l c0472l;
        super.onDetachedFromWindow();
        InterfaceC0455c0 interfaceC0455c0 = this.h;
        if (interfaceC0455c0 != null) {
            LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = ((C0372t) interfaceC0455c0).f6668b;
            InterfaceC0457d0 interfaceC0457d0 = layoutInflaterFactory2C0351E.f6533r;
            if (interfaceC0457d0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0457d0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((V0) actionBarOverlayLayout.f2393e).f7624a.f2480a;
                if (actionMenuView != null && (c0472l = actionMenuView.f2416t) != null) {
                    c0472l.c();
                    C0462g c0462g = c0472l.f7693u;
                    if (c0462g != null && c0462g.b()) {
                        c0462g.i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0351E.f6538w != null) {
                layoutInflaterFactory2C0351E.f6528l.getDecorView().removeCallbacks(layoutInflaterFactory2C0351E.f6539x);
                if (layoutInflaterFactory2C0351E.f6538w.isShowing()) {
                    try {
                        layoutInflaterFactory2C0351E.f6538w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0351E.f6538w = null;
            }
            h0 h0Var = layoutInflaterFactory2C0351E.f6540y;
            if (h0Var != null) {
                h0Var.b();
            }
            m mVar = layoutInflaterFactory2C0351E.A(0).h;
            if (mVar != null) {
                mVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0455c0 interfaceC0455c0) {
        this.h = interfaceC0455c0;
    }
}
