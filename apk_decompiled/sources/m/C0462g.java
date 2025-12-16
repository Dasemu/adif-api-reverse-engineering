package m;

import android.content.Context;
import android.view.View;
import com.adif.elcanomovil.R;
import l.SubMenuC0422E;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0462g extends l.w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7660l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0472l f7661m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0462g(C0472l c0472l, Context context, l.m mVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, mVar, true);
        this.f7661m = c0472l;
        this.f7308f = 8388613;
        h3.d dVar = c0472l.f7696x;
        this.h = dVar;
        l.u uVar = this.i;
        if (uVar != null) {
            uVar.e(dVar);
        }
    }

    @Override // l.w
    public final void c() {
        switch (this.f7660l) {
            case 0:
                C0472l c0472l = this.f7661m;
                c0472l.f7693u = null;
                c0472l.f7697y = 0;
                super.c();
                return;
            default:
                C0472l c0472l2 = this.f7661m;
                l.m mVar = c0472l2.f7678c;
                if (mVar != null) {
                    mVar.c(true);
                }
                c0472l2.f7692t = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0462g(C0472l c0472l, Context context, SubMenuC0422E subMenuC0422E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0422E, false);
        this.f7661m = c0472l;
        if ((subMenuC0422E.f7178A.f7288x & 32) != 32) {
            View view2 = c0472l.f7683j;
            this.f7307e = view2 == null ? (View) c0472l.h : view2;
        }
        h3.d dVar = c0472l.f7696x;
        this.h = dVar;
        l.u uVar = this.i;
        if (uVar != null) {
            uVar.e(dVar);
        }
    }
}
