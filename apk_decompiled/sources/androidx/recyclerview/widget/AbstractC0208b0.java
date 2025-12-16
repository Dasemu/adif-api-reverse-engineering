package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import d0.C0305c;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: androidx.recyclerview.widget.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0208b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3793a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3794b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3795c;

    public AbstractC0208b0(AbstractC0238q0 abstractC0238q0) {
        this.f3793a = IntCompanionObject.MIN_VALUE;
        this.f3795c = new Rect();
        this.f3794b = abstractC0238q0;
    }

    public static AbstractC0208b0 a(AbstractC0238q0 abstractC0238q0, int i) {
        if (i == 0) {
            return new C0206a0(abstractC0238q0, 0);
        }
        if (i == 1) {
            return new C0206a0(abstractC0238q0, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);

    public AbstractC0208b0(d0.g gVar) {
        this.f3793a = 0;
        this.f3795c = new C0305c();
        this.f3794b = gVar;
    }
}
