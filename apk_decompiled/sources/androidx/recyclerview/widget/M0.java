package androidx.recyclerview.widget;

import java.util.Arrays;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3578a;

    /* renamed from: b, reason: collision with root package name */
    public int f3579b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3580c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3581d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3582e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3583f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f3584g;

    public M0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f3584g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f3578a = -1;
        this.f3579b = IntCompanionObject.MIN_VALUE;
        this.f3580c = false;
        this.f3581d = false;
        this.f3582e = false;
        int[] iArr = this.f3583f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
