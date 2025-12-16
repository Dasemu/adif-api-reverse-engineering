package O;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class o0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C0060d f1278a;

    /* renamed from: b, reason: collision with root package name */
    public List f1279b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f1280c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1281d;

    public o0(C0060d c0060d) {
        super(0);
        this.f1281d = new HashMap();
        this.f1278a = c0060d;
    }

    public final r0 a(WindowInsetsAnimation windowInsetsAnimation) {
        r0 r0Var = (r0) this.f1281d.get(windowInsetsAnimation);
        if (r0Var == null) {
            r0Var = new r0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                r0Var.f1292a = new p0(windowInsetsAnimation);
            }
            this.f1281d.put(windowInsetsAnimation, r0Var);
        }
        return r0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0060d c0060d = this.f1278a;
        a(windowInsetsAnimation);
        ((View) c0060d.f1239e).setTranslationY(BitmapDescriptorFactory.HUE_RED);
        this.f1281d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0060d c0060d = this.f1278a;
        a(windowInsetsAnimation);
        View view = (View) c0060d.f1239e;
        int[] iArr = (int[]) c0060d.f1240f;
        view.getLocationOnScreen(iArr);
        c0060d.f1237c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f1280c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f1280c = arrayList2;
            this.f1279b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation k4 = n0.k(list.get(size));
            r0 a2 = a(k4);
            fraction = k4.getFraction();
            a2.f1292a.d(fraction);
            this.f1280c.add(a2);
        }
        C0060d c0060d = this.f1278a;
        D0 f2 = D0.f(null, windowInsets);
        c0060d.a(f2, this.f1279b);
        return f2.e();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0060d c0060d = this.f1278a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        G.c c4 = G.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        G.c c5 = G.c.c(upperBound);
        View view = (View) c0060d.f1239e;
        int[] iArr = (int[]) c0060d.f1240f;
        view.getLocationOnScreen(iArr);
        int i = c0060d.f1237c - iArr[1];
        c0060d.f1238d = i;
        view.setTranslationY(i);
        n0.m();
        return n0.i(c4.d(), c5.d());
    }
}
