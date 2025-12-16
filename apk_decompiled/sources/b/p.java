package b;

import a.AbstractC0106b;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import androidx.lifecycle.q0;
import kotlin.jvm.internal.Intrinsics;
import v0.C0639d;
import v0.C0640e;

/* loaded from: classes.dex */
public class p extends Dialog implements J, D, v0.f {

    /* renamed from: a, reason: collision with root package name */
    public L f4128a;

    /* renamed from: b, reason: collision with root package name */
    public final C0640e f4129b;

    /* renamed from: c, reason: collision with root package name */
    public final B f4130c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(this, "owner");
        this.f4129b = new C0640e(this);
        this.f4130c = new B(new F2.f(this, 6));
    }

    public static void a(p this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        q0.m(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        AbstractC0106b.H(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        m3.d.D(decorView3, this);
    }

    @Override // androidx.lifecycle.J
    public final androidx.lifecycle.C getLifecycle() {
        L l4 = this.f4128a;
        if (l4 != null) {
            return l4;
        }
        L l5 = new L(this);
        this.f4128a = l5;
        return l5;
    }

    @Override // b.D
    public final B getOnBackPressedDispatcher() {
        return this.f4130c;
    }

    @Override // v0.f
    public final C0639d getSavedStateRegistry() {
        return this.f4129b.f8636b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f4130c.d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher invoker;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            invoker = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(invoker, "onBackInvokedDispatcher");
            B b4 = this.f4130c;
            b4.getClass();
            Intrinsics.checkNotNullParameter(invoker, "invoker");
            b4.f4100e = invoker;
            b4.e(b4.f4102g);
        }
        this.f4129b.b(bundle);
        L l4 = this.f4128a;
        if (l4 == null) {
            l4 = new L(this);
            this.f4128a = l4;
        }
        l4.f(androidx.lifecycle.A.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f4129b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        L l4 = this.f4128a;
        if (l4 == null) {
            l4 = new L(this);
            this.f4128a = l4;
        }
        l4.f(androidx.lifecycle.A.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        L l4 = this.f4128a;
        if (l4 == null) {
            l4 = new L(this);
            this.f4128a = l4;
        }
        l4.f(androidx.lifecycle.A.ON_DESTROY);
        this.f4128a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
