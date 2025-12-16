package F2;

import A.j;
import I2.C0053d;
import I2.l;
import L.i;
import a.AbstractC0106b;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.A;
import androidx.lifecycle.C0181c0;
import androidx.lifecycle.L;
import b.k;
import b.p;
import c2.n;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.installations.FirebaseInstallations;
import d0.o;
import d2.h;
import java.nio.MappedByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f550b;

    public /* synthetic */ f(Object obj, int i) {
        this.f549a = i;
        this.f550b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f549a) {
            case 0:
                g gVar = (g) this.f550b;
                gVar.f553c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) gVar.f555e;
                X.d dVar = sideSheetBehavior.i;
                if (dVar != null && dVar.f()) {
                    gVar.a(gVar.f552b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.w(gVar.f552b);
                        return;
                    }
                    return;
                }
            case 1:
                ((C0053d) this.f550b).t(true);
                return;
            case 2:
                l lVar = (l) this.f550b;
                boolean isPopupShowing = lVar.h.isPopupShowing();
                lVar.t(isPopupShowing);
                lVar.f830m = isPopupShowing;
                return;
            case 3:
                ((TextInputLayout) this.f550b).f5839d.requestLayout();
                return;
            case 4:
                C0181c0 this$0 = (C0181c0) this.f550b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i = this$0.f3338b;
                L l4 = this$0.f3342f;
                if (i == 0) {
                    this$0.f3339c = true;
                    l4.f(A.ON_PAUSE);
                }
                if (this$0.f3337a == 0 && this$0.f3339c) {
                    l4.f(A.ON_STOP);
                    this$0.f3340d = true;
                    return;
                }
                return;
            case 5:
                k this$02 = (k) this.f550b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Runnable runnable = this$02.f4119b;
                if (runnable != null) {
                    Intrinsics.checkNotNull(runnable);
                    runnable.run();
                    this$02.f4119b = null;
                    return;
                }
                return;
            case 6:
                p.a((p) this.f550b);
                return;
            case 7:
                n nVar = (n) this.f550b;
                nVar.getClass();
                ((h) nVar.f4284d).Y(new I2.k(nVar, 7));
                return;
            case 8:
                ((com.google.android.material.timepicker.e) this.f550b).i();
                return;
            case 9:
                ((FirebaseInstallations) this.f550b).lambda$getId$1();
                return;
            case 10:
                o oVar = (o) this.f550b;
                synchronized (oVar.f6143d) {
                    try {
                        if (oVar.h == null) {
                            return;
                        }
                        try {
                            i c4 = oVar.c();
                            int i4 = c4.f1042e;
                            if (i4 == 2) {
                                synchronized (oVar.f6143d) {
                                }
                            }
                            if (i4 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i4 + ")");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                E2.e eVar = oVar.f6142c;
                                Context context = oVar.f6140a;
                                eVar.getClass();
                                Typeface a2 = G.g.a(context, new i[]{c4}, 0);
                                MappedByteBuffer v3 = AbstractC0106b.v(oVar.f6140a, c4.f1038a);
                                if (v3 == null || a2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    j jVar = new j(a2, AbstractC0106b.B(v3));
                                    Trace.endSection();
                                    synchronized (oVar.f6143d) {
                                        try {
                                            m3.l lVar2 = oVar.h;
                                            if (lVar2 != null) {
                                                lVar2.M(jVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    oVar.b();
                                    return;
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (oVar.f6143d) {
                                try {
                                    m3.l lVar3 = oVar.h;
                                    if (lVar3 != null) {
                                        lVar3.L(th2);
                                    }
                                    oVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 11:
                ((CarouselLayoutManager) this.f550b).t0();
                return;
            default:
                View view = (View) this.f550b;
                ((InputMethodManager) D.h.getSystemService(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }
}
