package com.adif.elcanomovil.uiAvisa.components.create;

import androidx.lifecycle.Y;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Y, FunctionAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lambda f4846b;

    /* JADX WARN: Multi-variable type inference failed */
    public l(int i, Function1 function) {
        this.f4845a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f4846b = (Lambda) function;
                return;
            case 2:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f4846b = (Lambda) function;
                return;
            case 3:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f4846b = (Lambda) function;
                return;
            case 4:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f4846b = (Lambda) function;
                return;
            case 5:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f4846b = (Lambda) function;
                return;
            case 6:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f4846b = (Lambda) function;
                return;
            default:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f4846b = (Lambda) function;
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f4845a) {
            case 0:
                if (!(obj instanceof Y) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual(this.f4846b, ((FunctionAdapter) obj).getFunctionDelegate());
            case 1:
                if (!(obj instanceof Y) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual(this.f4846b, ((FunctionAdapter) obj).getFunctionDelegate());
            case 2:
                if (!(obj instanceof Y) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual(this.f4846b, ((FunctionAdapter) obj).getFunctionDelegate());
            case 3:
                if (!(obj instanceof Y) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual(this.f4846b, ((FunctionAdapter) obj).getFunctionDelegate());
            case 4:
                if (!(obj instanceof Y) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual(this.f4846b, ((FunctionAdapter) obj).getFunctionDelegate());
            case 5:
                if (!(obj instanceof Y) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual(this.f4846b, ((FunctionAdapter) obj).getFunctionDelegate());
            default:
                if (!(obj instanceof Y) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual(this.f4846b, ((FunctionAdapter) obj).getFunctionDelegate());
        }
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        switch (this.f4845a) {
            case 0:
                return this.f4846b;
            case 1:
                return this.f4846b;
            case 2:
                return this.f4846b;
            case 3:
                return this.f4846b;
            case 4:
                return this.f4846b;
            case 5:
                return this.f4846b;
            default:
                return this.f4846b;
        }
    }

    public final int hashCode() {
        switch (this.f4845a) {
            case 0:
                return this.f4846b.hashCode();
            case 1:
                return this.f4846b.hashCode();
            case 2:
                return this.f4846b.hashCode();
            case 3:
                return this.f4846b.hashCode();
            case 4:
                return this.f4846b.hashCode();
            case 5:
                return this.f4846b.hashCode();
            default:
                return this.f4846b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.lifecycle.Y
    public final /* synthetic */ void onChanged(Object obj) {
        switch (this.f4845a) {
            case 0:
                this.f4846b.invoke(obj);
                return;
            case 1:
                this.f4846b.invoke(obj);
                return;
            case 2:
                this.f4846b.invoke(obj);
                return;
            case 3:
                this.f4846b.invoke(obj);
                return;
            case 4:
                this.f4846b.invoke(obj);
                return;
            case 5:
                this.f4846b.invoke(obj);
                return;
            default:
                this.f4846b.invoke(obj);
                return;
        }
    }
}
