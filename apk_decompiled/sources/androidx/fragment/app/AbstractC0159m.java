package androidx.fragment.app;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0159m {

    /* renamed from: a, reason: collision with root package name */
    public final J0 f3181a;

    public AbstractC0159m(J0 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f3181a = operation;
    }

    public final boolean a() {
        M0 m02;
        J0 j02 = this.f3181a;
        View view = j02.f3038c.mView;
        M0 m03 = M0.f3055b;
        if (view != null) {
            Intrinsics.checkNotNullParameter(view, "<this>");
            float alpha = view.getAlpha();
            m02 = M0.f3057d;
            if (alpha != BitmapDescriptorFactory.HUE_RED || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    m02 = m03;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(visibility, "Unknown visibility "));
                    }
                    m02 = M0.f3056c;
                }
            }
        } else {
            m02 = null;
        }
        M0 m04 = j02.f3036a;
        if (m02 != m04) {
            return (m02 == m03 || m04 == m03) ? false : true;
        }
        return true;
    }
}
