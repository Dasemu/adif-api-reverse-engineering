package androidx.lifecycle;

import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0191l implements Y, FunctionAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3397a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lambda f3398b;

    public C0191l(I1.b function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f3398b = function;
    }

    public final boolean equals(Object obj) {
        switch (this.f3397a) {
            case 0:
                if (!(obj instanceof Y) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual((I1.b) this.f3398b, ((FunctionAdapter) obj).getFunctionDelegate());
            case 1:
                if (!(obj instanceof Y) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual((b1.e) this.f3398b, ((FunctionAdapter) obj).getFunctionDelegate());
            case 2:
                if (!(obj instanceof Y) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual((com.adif.elcanomovil.uiStations.main.a) this.f3398b, ((FunctionAdapter) obj).getFunctionDelegate());
            case 3:
                if (!(obj instanceof Y) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual((com.adif.elcanomovil.uiStations.main.b) this.f3398b, ((FunctionAdapter) obj).getFunctionDelegate());
            case 4:
                if (!(obj instanceof Y) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual((com.adif.elcanomovil.uiStations.main.f) this.f3398b, ((FunctionAdapter) obj).getFunctionDelegate());
            case 5:
                if (!(obj instanceof Y) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual((com.adif.elcanomovil.uiSubscriptions.home.c) this.f3398b, ((FunctionAdapter) obj).getFunctionDelegate());
            default:
                if (!(obj instanceof Y) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual((T0.j) this.f3398b, ((FunctionAdapter) obj).getFunctionDelegate());
        }
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        switch (this.f3397a) {
            case 0:
                return (I1.b) this.f3398b;
            case 1:
                return (b1.e) this.f3398b;
            case 2:
                return (com.adif.elcanomovil.uiStations.main.a) this.f3398b;
            case 3:
                return (com.adif.elcanomovil.uiStations.main.b) this.f3398b;
            case 4:
                return (com.adif.elcanomovil.uiStations.main.f) this.f3398b;
            case 5:
                return (com.adif.elcanomovil.uiSubscriptions.home.c) this.f3398b;
            default:
                return (T0.j) this.f3398b;
        }
    }

    public final int hashCode() {
        switch (this.f3397a) {
            case 0:
                return ((I1.b) this.f3398b).hashCode();
            case 1:
                return ((b1.e) this.f3398b).hashCode();
            case 2:
                return ((com.adif.elcanomovil.uiStations.main.a) this.f3398b).hashCode();
            case 3:
                return ((com.adif.elcanomovil.uiStations.main.b) this.f3398b).hashCode();
            case 4:
                return ((com.adif.elcanomovil.uiStations.main.f) this.f3398b).hashCode();
            case 5:
                return ((com.adif.elcanomovil.uiSubscriptions.home.c) this.f3398b).hashCode();
            default:
                return ((T0.j) this.f3398b).hashCode();
        }
    }

    @Override // androidx.lifecycle.Y
    public final /* synthetic */ void onChanged(Object obj) {
        switch (this.f3397a) {
            case 0:
                ((I1.b) this.f3398b).invoke(obj);
                return;
            case 1:
                ((b1.e) this.f3398b).invoke(obj);
                return;
            case 2:
                ((com.adif.elcanomovil.uiStations.main.a) this.f3398b).invoke(obj);
                return;
            case 3:
                ((com.adif.elcanomovil.uiStations.main.b) this.f3398b).invoke(obj);
                return;
            case 4:
                ((com.adif.elcanomovil.uiStations.main.f) this.f3398b).invoke(obj);
                return;
            case 5:
                ((com.adif.elcanomovil.uiSubscriptions.home.c) this.f3398b).invoke(obj);
                return;
            default:
                ((T0.j) this.f3398b).invoke(obj);
                return;
        }
    }

    public C0191l(T0.j function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f3398b = function;
    }

    public C0191l(b1.e function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f3398b = function;
    }

    public C0191l(com.adif.elcanomovil.uiStations.main.a function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f3398b = function;
    }

    public C0191l(com.adif.elcanomovil.uiStations.main.b function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f3398b = function;
    }

    public C0191l(com.adif.elcanomovil.uiStations.main.f function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f3398b = function;
    }

    public C0191l(com.adif.elcanomovil.uiSubscriptions.home.c function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f3398b = function;
    }
}
